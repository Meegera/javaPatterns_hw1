package org.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int N = sc.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int M = sc.nextInt();

        logger.log("Создаем и наполняем список");
        System.out.print("Вот случайный список: ");
        Random random = new Random();
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            source.add(random.nextInt(M));
            System.out.print(source.get(i) + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int f = sc.nextInt();


        Filter filter = new Filter(f);
        result = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (Integer x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}