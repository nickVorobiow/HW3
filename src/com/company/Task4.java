package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        final byte productivityPer2Min = 16;
        final short productivityPerHour = productivityPer2Min * 30;
        final short productivityPerDay = productivityPerHour * 24;
        final int productivityPerMonth = productivityPerDay * 30;

        boolean flag = true;
        do {
            System.out.println("Ввести кол-во времени: 1- в минутах\n" +
                    "2 -в сутках\n" +
                    "3 -в месяцах\n" +
                    ". -выйти\n" +
                    "Введите выбор, нажмите Enter...");
            Scanner in = new Scanner(System.in);
            String choice = in.nextLine();
            switch (choice) {
                case "1": {
                    System.out.print("Введите кол-во минут:");
                    int time = in.nextInt();
                    System.out.println("За " + time + " минут машина произвела бутылок " +
                            time/2 * productivityPer2Min + " штук");
                    break;
                }
                case "2": {
                    System.out.print("Введите кол-во суток:");
                    int time = in.nextInt();
                    System.out.println("За " + time + " суток машина произвела бутылок " +
                            productivityPerDay * time + " штук");
                    break;
                }
                case "3": {
                    System.out.print("Введите кол-во месяцев:");
                    int time = in.nextInt();
                    System.out.println("За " + time + " месяцев машина произвела бутылок " +
                            productivityPerMonth * time + " штук");
                    break;
                }

                default: {
                    System.out.println("Нет такого варианта");
                    break;
                }
                case ".": {
                    flag = false;
                    System.out.println("Выход из программы...");
                }
            }
        } while(flag);
    }
}
