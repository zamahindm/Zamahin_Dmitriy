package ru.mirea.task10.number2;

import java.util.*;

class Student {
    private int iDNumber;
    private String name;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}

class SortingStudentsByGPA {
    private List<Student> studentList;

    public SortingStudentsByGPA() {
        studentList = new ArrayList<>();
    }

    public void setArray(List<Student> students) {
        studentList = students;
    }

    public void quicksort() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Double.compare(student2.getGPA(), student1.getGPA());
            }
        });
    }

    public void outArray() {
        for (Student student : studentList) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }

    public void sortByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Алиса", 3.8));
        students.add(new Student(103, "Иван", 3.5));
        students.add(new Student(102, "Андрей", 4.0));
        students.add(new Student(105, "Давид", 3.9));
        students.add(new Student(104, "Лиза", 3.7));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students);

        System.out.println("До сортировки по GPA:");
        sorter.outArray();

        sorter.quicksort();

        System.out.println("\nПосле сортировки по GPA (в порядке убывания):");
        sorter.outArray();

        sorter.sortByName();

        System.out.println("\nПосле сортировки по имени:");
        sorter.outArray();
    }
}

