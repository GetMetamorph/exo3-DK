package main;

import main.CsvData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvParser {
    String fileName;
    String fileExtension;

    public CsvParser(String fileName) {
        this.fileName = fileName;
        this.fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public CsvData parseCsv() {
        CsvData csvData = new CsvData();

        if (!fileExtension.equals("csv")) {
            System.out.println("File extension must be .csv");
            return csvData;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    csvData.addValue(value);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return csvData;
    }

}
