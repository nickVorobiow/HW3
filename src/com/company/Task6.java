package com.company;

public class Task6 {
    public static void main(String[] args) {
        int weight =
                80 * 5 +
                105 * 2 +
                100 * 2 +
                70 * 4;
        System.out.println("Кол-во грамм:" + weight);
        System.out.println("Кол-во килограмм:" + (double)weight/1000);
    }
}
