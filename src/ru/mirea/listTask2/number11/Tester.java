package ru.mirea.listTask2.number11;

public class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(8);
        list.insert(1);
        list.insert(7);

        System.out.println("Список до сортировки:");
        list.display();

        list.head = list.mergeSort(list.head);

        System.out.println("Список после сортировки:");
        list.display();
    }
}
