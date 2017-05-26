package com.globallogic.faers.zip.downloader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Downloader {

    public void download(String source, String destinationDirectory) {
        Logger logger = LogManager.getLogger(Downloader.class);
        try {
            BufferedOutputStream out;
            URL sourceUrl = new URL(source);
            try (BufferedInputStream in = new BufferedInputStream(sourceUrl.openStream())) {
                File newFile = new File(destinationDirectory + sourceUrl.getFile());
                File destDirectory = new File(newFile.getParent());
                if (!destDirectory.exists()) {
                    destDirectory.mkdirs();
                }
                newFile.createNewFile();
                out = new BufferedOutputStream(new FileOutputStream(newFile));
                byte data[] = new byte[1024];
                int count;
                while ((count = in.read(data, 0, 1024)) != -1) {
                    out.write(data, 0, count);
                }
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException fileNotFoundException) {
            logger.error("Exception while downloading: " + source + "into: " + destinationDirectory);
            logger.catching(fileNotFoundException);
        } catch (IOException ioException) {
            logger.error("Exception while downloading: " + source + "into: " + destinationDirectory);
            logger.catching(ioException);
        }
    }
}
