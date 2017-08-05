package com.faersmini.app;

import com.faersmini.json.DAO;
import com.faersmini.json.importer.DBImporter;
import com.faersmini.zip.downloader.Downloader;
import com.faersmini.zip.downloader.DrugEventList;
import com.faersmini.zip.downloader.Partition;
import com.faersmini.zip.extractor.Extractor;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String helpMessage = "-download https://api.fda.gov/download.json -directory D:/X -extract D:/JSON/ -extractDestination D:/JSON/EXTRACTED -import D:/JSON/EXTRACTED -db faers -ip 192.168.0.17 -port 5432 -user faers -pass brutepass";
        Logger logger = LogManager.getLogger(Cli.class);
        OptionParser parser = new OptionParser();

        parser.accepts("download").withRequiredArg();
        parser.accepts("directory").withRequiredArg();

        parser.accepts("extract").withRequiredArg();
        parser.accepts("extractDestination").withRequiredArg();

        parser.accepts("import").withRequiredArg();
        parser.accepts("ip").withRequiredArg();
        parser.accepts("port").withRequiredArg();
        parser.accepts("db").withRequiredArg();
        parser.accepts("user").withRequiredArg();
        parser.accepts("pass").withRequiredArg();

        OptionSet opt = parser.parse(args);
        String arguments = Arrays.toString(args);
        if (arguments.contains("pass")) {
            arguments = arguments.replace((String) opt.valueOf("pass"), "*");
        }
        logger.info("Cli started with args: " + arguments);
        if (opt.has("download")) {
            String downloadURL = (String) opt.valueOf("download");
            String destDirectory = null;
            if (opt.has("directory")) {
                destDirectory = (String) opt.valueOf("directory");
            } else {
                logger.error("You have not specified destination directory for file: " + downloadURL);
                logger.info("Help: " + helpMessage);
                System.exit(1);
            }
            Downloader downloader = new Downloader();
            downloader.download(downloadURL, destDirectory);
            DAO dao = new DAO();
            DrugEventList list = dao.getDrugEventListFromJSON(destDirectory + File.separator + "download.json");
            List<Partition> partitionList = list.getResults().getDrug().getEvent().getPartitions();
            Double downloadSize = 0.0;
            for (Partition partition : partitionList) {
                downloadSize += Double.parseDouble(partition.getSizeMB());
            }
            int i = 1;
            for (Partition partition : partitionList) {
                logger.info("Downloading partition: " + i + "(" + partition.getSizeMB() + " MB)" + File.separator + partitionList.size());
                downloader.download(partition.getFileURL(), destDirectory);
                downloadSize -=  Double.parseDouble(partition.getSizeMB());
                Double dowloadSizeTruncated = BigDecimal.valueOf(downloadSize).setScale(2, RoundingMode.HALF_UP).doubleValue();
                logger.info("Partition downloaded, remaining: " + dowloadSizeTruncated + " MB");
                i++;
            }
            logger.info("Download completed succesfully!");
        }
        if (opt.has("extract")) {
            String extractSourcePath = (String) opt.valueOf("extract");
            Extractor zipExtractor = new Extractor();
            if (opt.has("extractDestination")) {
                String extractDestinationPath = (String) opt.valueOf("extractDestination");
                logger.info("ZIP extraction started from: " + extractSourcePath + " to: " + extractDestinationPath);
                zipExtractor.extractAll(zipExtractor.getAllZipFromDirectory(new File(extractSourcePath)), new File(extractDestinationPath));
            } else {
                logger.error("You must specify a directory where you want to extract the zip files!");
                logger.info("Help: " + helpMessage);
            }
        }
        if (opt.has("import")) {
            String importSource = (String) opt.valueOf("import");
            String db = null;
            String ip = null;
            String port = null;
            String user = null;
            String password = null;
            if (opt.has("db")) {
                db = (String) opt.valueOf("db");
            }
            if (opt.has("ip")) {
                ip = (String) opt.valueOf("ip");
            }
            if (opt.has("port")) {
                port = (String) opt.valueOf("port");
            }
            if (opt.has("user")) {
                user = (String) opt.valueOf("user");
            }
            if (opt.has("pass")) {
                password = (String) opt.valueOf("pass");
            }
            if (db == null || ip == null || port == null || user == null || password == null) {
                logger.error("You must specify db name, ip, port, user and password");
                logger.info("Help: " + helpMessage);
            }

            DBImporter importer = new DBImporter();
            importer.importAllJsonFromDirectory(new File(importSource), ip, port, db, user, password);
        }

    }
}
