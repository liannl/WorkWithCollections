package com.example;

import java.util.List;

public class DataPrinter {
    public static void printList(List<List<String>> list) {
        // Проверка наличия данных
        if (list.isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        // Получаем заголовок из первой строки
        List<String> headers = list.get(0);

        // Вывод заголовка
        System.out.println(String.join("\t", headers));

        // Вывод данных
        for (int i = 1; i < list.size(); i++) {
            List<String> data = list.get(i);
            System.out.println(String.join("\t", data));
        }
    }
}
