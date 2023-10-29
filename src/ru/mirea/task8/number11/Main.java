package ru.mirea.task8.number11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0; // Счетчик числа 1 в последовательности

        int currentNumber; // Текущее считанное число
        int previousNumber = -1; // Предыдущее считанное число, начальное значение -1

        while (true) {
            currentNumber = scanner.nextInt();

            if (currentNumber == 0 && previousNumber == 0) {
                // Встретили два нуля подряд, завершаем ввод
                break;
            }

            if (currentNumber == 1) {
                count++; // Увеличиваем счетчик, если текущее число - 1
            }

            previousNumber = currentNumber; // Обновляем предыдущее число
        }

        System.out.println("Количество единиц в последовательности: " + count);
    }
}

