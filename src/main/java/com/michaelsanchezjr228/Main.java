package com.michaelsanchezjr228;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int week = 14;
        Calculations.addTeams();
        Data.addGames(week);
        for (int index = 0; index <= week; index++) {
            Calculations.determineOutcomes(index);
            Calculations.calculateScores(index);
        }
        
        ArrayList<Team> ranked = Calculations.getRankedList(week);
        for (int i = 0; i < ranked.size(); i++) {
            System.out.println((i + 1) + ". " + ranked.get(i).getName() + " - " + ranked.get(i).getScore(week));
        }
    }
}