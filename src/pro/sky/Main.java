package pro.sky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task1_1();
        task2();
        task3();
        taskScanner();
    }

    public static void task1() {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.printf("ФИО сотрудника — %s %s %s", lastName, firstName, middleName);

    }

    public static void task1_1() {
        System.out.println("\nTask 1_1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s", fullName);
    }

        public static void task2() {
        System.out.println("\nTask 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String desiredResult = fullName.toUpperCase();
        System.out.printf("ФИО сотрудника — %s", desiredResult);
    }
    public static void task3() {
        System.out.println("\nTask 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String desiredResult = fullName.replace('ё','е');
        System.out.printf("ФИО сотрудника — %s", desiredResult);
    }

    public static void taskScanner() {
        System.out.println("\nTask Scanner");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.next();
        System.out.println("Enter last name:");
        String lastName = scanner.next();
        System.out.println("Enter middle name:");
        String middleName = scanner.next();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s\n", fullName);
    }
}

