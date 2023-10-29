package ru.mirea.task10.number3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Имя='" + name + '\'' +
                ", GPA=" + gpa +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "Алиса", 3.8));
        list1.add(new Student(2, "Иван", 3.5));
        list1.add(new Student(3, "Андрей", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(4, "Давид", 3.9));
        list2.add(new Student(5, "Лиза", 3.7));
        list2.add(new Student(6, "Фёдор", 3.6));

        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Сортировка по итоговому баллу (GPA) в порядке убывания
        Collections.sort(mergedList, (student1, student2) -> Double.compare(student2.getGpa(), student1.getGpa()));

        // Вывод объединенного и отсортированного списка
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
