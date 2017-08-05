package com.faersmini.zip.downloader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Downloader {

    public void download(String source, String destinationDirectory) {
        Logger logger = LogManager.getLogger(Downloader.class);

        try {
            URL sourceUrl = new URL(source);
            File newFile = new File(destinationDirectory + sourceUrl.getFile());
            if (newFile.getParentFile() != null) {
                if (!newFile.getParentFile().exists() && !newFile.getParentFile().mkdirs()) {
                    logger.error("Cannot create parent directories for file " + newFile.getAbsolutePath());
                    throw new IOException();
                }
            }
            if (!newFile.createNewFile()) {
                logger.error("Cannot create file " + newFile.getAbsolutePath());
                throw new IOException();
            }

            try (BufferedInputStream in = new BufferedInputStream(sourceUrl.openStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));) {
                File destDirectory = new File(newFile.getParent());
                if (!destDirectory.exists()) {
                    if (!destDirectory.mkdirs()) {
                        logger.error("Cannot create directory " + destDirectory.getAbsolutePath());
                        throw new IOException();
                    }
                }
                byte data[] = new byte[1024];
                int count;
                while ((count = in.read(data, 0, 1024)) != -1) {
                    out.write(data, 0, count);
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            logger.error("Exception while downloading: " + source + " into: " + destinationDirectory);
            logger.catching(fileNotFoundException);
        } catch (IOException ioException) {
            logger.error("Exception while downloading: " + source + " into: " + destinationDirectory);
            logger.catching(ioException);
        }
    }
}
