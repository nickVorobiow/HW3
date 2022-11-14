package com.company;

public class Task8 {
    public static void main(String[] args) {
        int MashaCurrentSalary = 67760;
        int DenisCurrentSalary = 83690;
        int KristinaCurrentSalary = 76230;

        int MashaYearSalary = MashaCurrentSalary * 12;
        int DenisYearSalary = DenisCurrentSalary * 12;
        int KristinaYearSalary = KristinaCurrentSalary * 12;

        double NewMashaYearSalary = MashaCurrentSalary * 12 * 1.1;
        double NewDenisYearSalary = DenisCurrentSalary * 12 * 1.1;
        double NewKristinaYearSalary = KristinaCurrentSalary * 12 * 1.1;

        System.out.println("Маша теперь получает " + MashaCurrentSalary * 1.1 + " рублей." +
                " Годовой доход вырос на " + (NewMashaYearSalary - MashaYearSalary) + " рублей");
        System.out.println("Денис теперь получает " + DenisCurrentSalary * 1.1 + " рублей. " +
                " Годовой доход вырос на " + (NewDenisYearSalary - DenisYearSalary) + " рублей");
        System.out.println("Кристина теперь получает " + KristinaCurrentSalary * 1.1 + " рублей. " +
                " Годовой доход вырос на " + (NewKristinaYearSalary - KristinaYearSalary) + " рублей");
    }
}
