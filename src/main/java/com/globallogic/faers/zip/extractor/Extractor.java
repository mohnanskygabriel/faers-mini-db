package com.globallogic.faers.zip.extractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Extractor {

    public void extract(File zipFile, File destinationDirectory) {
        Logger logger = LogManager.getLogger(Extractor.class);
        ZipInputStream zipInputStream = null;
        byte[] buffer = new byte[1024];
        try {
            if (!destinationDirectory.exists()) {
                if (!destinationDirectory.mkdirs()) {
                    logger.error("Cannot create directory " + destinationDirectory.getAbsolutePath());
                    throw new IOException();
                }
            }
            zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            ZipEntry ze = zipInputStream.getNextEntry();
            while (ze != null) {
                String fileName = ze.getName();
                File newFile = new File(destinationDirectory.getAbsolutePath() + File.separator + fileName);
                logger.info("Unzipping file: " + zipFile.getAbsolutePath() + "\n" + "Destination: " + newFile.getAbsolutePath());
                if (newFile.getParentFile() != null) {
                    if (!newFile.getParentFile().exists() && !newFile.mkdirs()) {
                        logger.error("Cannot create directory " + newFile.getParent());
                        throw new IOException();
                    }
                }
                try (FileOutputStream fileOutputStream = new FileOutputStream(newFile)) {
                    int len;
                    while ((len = zipInputStream.read(buffer)) > 0) {
                        fileOutputStream.write(buffer, 0, len);
                    }
                }
                ze = zipInputStream.getNextEntry();
            }
        } catch (FileNotFoundException ex) {
            logger.catching(ex);
        } catch (IOException ioEx) {
            logger.catching(ioEx);
        } finally {
            try {
                if (zipInputStream != null) {
                    zipInputStream.close();
                }
                logger.info("File unzipped succesfully!");
            } catch (IOException ex) {
                logger.catching(ex);
            }
        }
    }

    public List<File> getAllZipFromDirectory(File sourceDirectory) {
        List<File> zipList = new LinkedList<>();
        Queue<File> directoryQueue = new LinkedList<>();
        File[] abstractPathnames = sourceDirectory.listFiles();
        if (abstractPathnames == null) {
            abstractPathnames = new File[0];
        }
        List<File> fileList = Arrays.asList(abstractPathnames);
        for (File file : fileList) {
            if (file.isDirectory()) {
                directoryQueue.add(file);
            } else if (file.isFile() && file.getName().endsWith(".zip")) {
                zipList.add(file);
            }
        }
        while (!directoryQueue.isEmpty()) {
            zipList.addAll(getAllZipFromDirectory(directoryQueue.poll()));
        }
        return zipList;
    }

    public void extractAll(List<File> zipFileList, File destinationDirectory) {
        Logger logger = LogManager.getLogger(Extractor.class);
        for (File zipFile : zipFileList) {
            String destinationDirectoryCompleteString = destinationDirectory.getAbsolutePath();
            destinationDirectoryCompleteString += File.separator + zipFile.getParentFile().getParentFile().getParentFile().getName();
            destinationDirectoryCompleteString += File.separator + zipFile.getParentFile().getParentFile().getName();
            destinationDirectoryCompleteString += File.separator + zipFile.getParentFile().getName();
            File destinationDirectoryComplete = new File(destinationDirectoryCompleteString);
            extract(zipFile, destinationDirectoryComplete);
        }
        logger.info("Unzipping: " + zipFileList.size() + " files successfully completed");
    }

}
