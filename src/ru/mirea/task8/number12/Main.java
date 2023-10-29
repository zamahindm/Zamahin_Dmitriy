package ru.mirea.task8.number12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Введите последовательность натуральных чисел (0 для завершения):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}

