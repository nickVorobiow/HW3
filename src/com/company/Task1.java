package com.company;

public class Task1 {

    public static void main(String[] args) {
	    byte byteVar = 127;
	    short shortVar = 10000;
	    int intVar = 40000;
	    long longVar = 1000_000_000l;
        float floatVar = 3.14159f;
        double doubleVar = 4.333_333_336_666;
        System.out.println("Значение переменной byteVar с типом " + ((Object)byteVar).getClass().getSimpleName() +
                " будет равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом " + ((Object)shortVar).getClass().getSimpleName() +
                " будет равно " + shortVar);
        System.out.println("Значение переменной intVar с типом " + ((Object)intVar).getClass().getSimpleName() +
                " будет равно " + intVar);
        System.out.println("Значение переменной longVar с типом " + ((Object)longVar).getClass().getSimpleName() +
                " будет равно " + longVar);
        System.out.println("Значение переменной floatVar с типом " + ((Object)floatVar).getClass().getSimpleName() +
                " будет равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом " + ((Object)doubleVar).getClass().getSimpleName() +
                " будет равно " + doubleVar);
    }
}
