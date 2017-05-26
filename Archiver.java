package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

/**
 * Created by amalakhov on 26.05.2017.
 */
public class Archiver {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the full path of file which you want to archive:");
        String filePath=reader.readLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(filePath));
        System.out.println("Enter the full path where you will want to have archived file:");
        String archivePath = reader.readLine();
        try {
            zipFileManager.createZip(Paths.get(archivePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
