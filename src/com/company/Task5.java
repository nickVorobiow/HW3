package com.company;

public class Task5 {
    public static void main(String[] args) {
        final byte amountOfCans = 120;
        final byte cansPerClass = 4 + 2;
        final byte amountOfClasses = amountOfCans/cansPerClass;

        System.out.println("В школе, где " + amountOfClasses + " классов,нужно " +
                amountOfClasses * 2 + " банок белой краски и\n" +
                amountOfClasses * 4 + " банок коричневой краски");
    }
}
