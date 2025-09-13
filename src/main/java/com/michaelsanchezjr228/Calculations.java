package com.michaelsanchezjr228;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculations {

    private static HashMap<String, Team> teams = new HashMap<>();
    private static ArrayList<Game> games = new ArrayList<>();

    public static HashMap<String, Team> getTeams() {
        return teams;
    }

    public static void resetGames() {
        games.clear();
    }

    public static void addTeams() {
        int index = 0;
        while (teams.size() < Data.getFBSTeams() && index < games.size()) {
            if (games.get(index).getHomeClass() == "fbs") {
                teams.put(games.get(index).getHomeName(), new Team(games.get(index).getHomeName()));
            }
            if (games.get(index).getAwayClass() == "fbs") {
                teams.put(games.get(index).getAwayName(), new Team(games.get(index).getAwayName()));
            }
            index++;
        }
    }

    public static void addGame(String week, String neutralSite, String homeName, String homeClass, String homeScore,
            String awayName, String awayClass, String awayScore) {
        games.add(new Game(week, neutralSite, homeName, homeClass, homeScore, awayName, awayClass, awayScore));
    }

    public static void determineOutcomes(int week) {
        for (Game game : games) {
            if (game.getHomeScore() > game.getAwayScore()) {
                teams.get(game.getHomeName()).addWonAgainst(game.getAwayName());
                teams.get(game.getAwayName()).addLostAgainst(game.getHomeName());
            } else if (game.getHomeScore() < game.getAwayScore()) {
                teams.get(game.getAwayName()).addWonAgainst(game.getHomeName());
                teams.get(game.getHomeName()).addLostAgainst(game.getAwayName());
            }
        }
    }

    /*public static void calculateScores(int week) {
        for (Team team : teams.values()) {
            int index = 0;
            while (index < team.getWonAgainst().size()) {
                int opponentScore = teams.get(team.getWonAgainst().get(index)).getScore(week);
            }
        }
    }*/
}