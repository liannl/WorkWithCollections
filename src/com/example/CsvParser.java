package com.example;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public List<List<String>> parseCsv(CSVReader reader) throws IOException {
        List<List<String>> peopleData = new ArrayList<>();

        // Считываем первую строку с названиями столбцов
        String[] headers = reader.readNext();

        // Добавляем названия столбцов в список данных
        peopleData.add(List.of(headers));

        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // Добавляем строку данных в список
            peopleData.add(List.of(nextLine));
        }

        return peopleData;
    }
}
