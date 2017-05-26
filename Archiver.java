package com.javarush.task.task31.task3110;


import com.javarush.task.task31.task3110.command.Command;
import com.javarush.task.task31.task3110.command.ExitCommand;

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
        System.out.println("Enter the full path where you will want to have archived file:");
        String archivePath=reader.readLine();
        System.out.println("Enter the full path of file which you want to archive:");
        String filePath = reader.readLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(archivePath));
        try {
            zipFileManager.createZip(Paths.get(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        reader.close();
        Command exit = new ExitCommand();
        try {
            exit.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
