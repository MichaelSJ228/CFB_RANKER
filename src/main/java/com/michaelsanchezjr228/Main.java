package com.michaelsanchezjr228;

public class Main {
    public static void main(String[] args) {
        int week = 1;
        Data.addGames(week);
        Calculations.addTeams();
        int index = 0;
        while (index <= week) {
            Calculations.determineOutcomes(week);
            //Calculations.calculateScores();
            index++;
        }
        System.out.println(Calculations.getTeams().keySet());
        System.out.println(Calculations.getTeams().size());
    }
}