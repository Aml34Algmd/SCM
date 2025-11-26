package com.scm.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileUtility - A simple Java utility tool for file operations
 * 
 * This tool provides basic file manipulation and analysis capabilities.
 */
public class FileUtility {
    
    /**
     * Main method to run the utility
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }
        
        String command = args[0];
        
        switch (command) {
            case "count-lines":
                if (args.length < 2) {
                    System.out.println("Error: Please provide a file path");
                    return;
                }
                countLines(args[1]);
                break;
            case "help":
                printUsage();
                break;
            default:
                System.out.println("Unknown command: " + command);
                printUsage();
        }
    }
    
    /**
     * Counts the number of lines in a file
     * 
     * @param filePath Path to the file
     */
    public static void countLines(String filePath) {
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.out.println("Error: File does not exist: " + filePath);
            return;
        }
        
        if (!file.isFile()) {
            System.out.println("Error: Path is not a file: " + filePath);
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("File: " + filePath);
            System.out.println("Total lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    /**
     * Prints usage information
     */
    private static void printUsage() {
        System.out.println("FileUtility - Java File Utility Tool");
        System.out.println("Version: 1.0");
        System.out.println();
        System.out.println("Usage: java FileUtility <command> [arguments]");
        System.out.println();
        System.out.println("Commands:");
        System.out.println("  count-lines <file>  Count the number of lines in a file");
        System.out.println("  help                Show this help message");
    }
}

