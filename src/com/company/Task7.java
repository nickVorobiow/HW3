package com.company;

public class Task7 {
    public static void main(String[] args) {
        final byte kilos = 7;
        final short grams = 7 * 1000;
        final short minLoose = 250;
        final short maxLoose = 500;

        byte minDays = grams/maxLoose;
        byte maxDays = grams/minLoose;
        float averageAmountOfDays = (minDays + maxDays)/2.0f;
        System.out.println(maxDays + " дней потребуется, если в день терять по 250гр.\n"
        + minDays + " дней потребуется, если в день терять по 500гр.\n"
        + averageAmountOfDays + " дней потребуется в среднем");
    }
}
