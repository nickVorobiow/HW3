package com.company;

public class Task3 {
    public static void main(String[] args) {
        byte LudmilaPavlovnaPupils = 23;
        byte AnnaSergeevnaPupils = 27;
        byte EkaterinaAndreevnaPupils = 30;
        short amountOfSheets = 480;
        byte totalAmountOfPupils = (byte) (LudmilaPavlovnaPupils + AnnaSergeevnaPupils + EkaterinaAndreevnaPupils);
        System.out.println("На каждого ученика рассчитано " + amountOfSheets/totalAmountOfPupils +
                " листов бумаги");
    }
}
