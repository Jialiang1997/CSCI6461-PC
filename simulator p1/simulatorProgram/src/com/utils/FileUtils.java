package com.utils;

import com.memory.MCU;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils {
    private static final String filename = "ipl.txt";

    public static void loadData(MCU mcu) {
        File file = new File(filename);
        try (Scanner in = new Scanner(new FileInputStream(file))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] data = line.split(" ");
                int address = Integer.parseInt(data[0], 16);
                int instruction = (short) Integer.parseInt(data[1], 16);
                System.out.println("Load location " + address + " value " + instruction);
                mcu.storeIntoCache(address, instruction);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
