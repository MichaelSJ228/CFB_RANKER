package com.michaelsanchezjr228;

public class Main {
    public static void main(String[] args) {
        int week = 6;
        Calculations.addTeams();
        Data.addGames(week);
        for (int index = 0; index <= week; index++) {
            Calculations.determineOutcomes(index);
            Calculations.calculateScores(index);
        }
        System.out.println(Calculations.getTeams().keySet());
        System.out.println(Calculations.getTeams().size());
        System.out.println(Calculations.findBestScore(week));
        System.out.println(Calculations.getTeams().get("Oregon").getScore(week));
        System.out.println(Calculations.getTeams().get("Oregon").getScore(week + 1));
    }
}