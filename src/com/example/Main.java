package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "data/foreign_names.csv";
        char separator = ';';

        CsvReader csvReader = new CsvReader();
        List<List<String>> peopleData = csvReader.readCsv(csvFilePath, separator);

        DataPrinter.printList(peopleData);
    }
}
