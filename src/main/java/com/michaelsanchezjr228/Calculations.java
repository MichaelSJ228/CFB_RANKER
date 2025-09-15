package com.michaelsanchezjr228;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Calculations {

    private static LinkedHashMap<String, Team> teams = new LinkedHashMap<>();
    private static ArrayList<Game> games = new ArrayList<>();

    public static LinkedHashMap<String, Team> getTeams() {
        return teams;
    }

    public static ArrayList<Team> getRankedList(int week) {
        ArrayList<Team> rankings = new ArrayList<>(teams.values());
        rankings.sort((a, b) -> Integer.compare(b.getScore(week), a.getScore(week)));
        return rankings;
    }

    public static void resetGames() {
        games.clear();
    }

    public static void addTeams() {
        Data.addGames(Data.getCurrentWeek());
        int index = 0;
        while (teams.size() <= Data.getFBSTeams()) {
            if (games.get(index).getHomeClass().equals("fbs")) {
                teams.put(games.get(index).getHomeName(), new Team(games.get(index).getHomeName()));
            }
            if (games.get(index).getAwayClass().equals("fbs")) {
                teams.put(games.get(index).getAwayName(), new Team(games.get(index).getAwayName()));
            }
            if (games.get(index).getHomeClass().equals("fcs") || games.get(index).getAwayClass().equals("fcs")) {
                teams.put("FCS", new Team("FCS"));
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
            if (game.getWeek() != week) {
                continue;
            }
            String homeLoc = "home";
            String awayLoc = "away";
            if (game.isNeutralSite()) {
                homeLoc = "neutral";
                awayLoc = "neutral";
            }
            if (game.getHomeScore() > game.getAwayScore()) {
                teams.get(game.getHomeName()).addWonAgainst(game.getAwayName(), homeLoc);
                teams.get(game.getAwayName()).addLostAgainst(game.getHomeName(), awayLoc);
            } else if (game.getHomeScore() < game.getAwayScore()) {
                teams.get(game.getAwayName()).addWonAgainst(game.getHomeName(), awayLoc);
                teams.get(game.getHomeName()).addLostAgainst(game.getAwayName(), homeLoc);
            }
        }
    }

    public static int findBestScore(int pre_week) {
        int best = Integer.MIN_VALUE;
        for (Team team : teams.values()) {
            if (team.getScore(pre_week) > best) {
                best = team.getScore(pre_week);
            }
        }
        return best;
    }

    public static void calculateScores(int week) {
        for (Team team : teams.values()) {
            int score;
            double points = Data.getFBSTeams();
            double winningPoints = 0;
            double losingPoints = 0;

            if (team.getName().equals("FCS")) {
                continue;
            }
            for (String won : team.getWonAgainst().keySet()) {
                String location = team.getWonAgainst().get(won);
                winningPoints += .2 * teams.get(won).getScore(week);
                if (location.equals("home")) {
                    winningPoints *= .97;
                } else if (location.equals("away")) {
                    winningPoints *= 1.03;
                }
            }
            for (String lost : team.getLostAgainst().keySet()) {
                String location = team.getLostAgainst().get(lost);
                int basePenalty = -Data.getFBSTeams();
                int opponentScore = teams.get(lost).getScore(week);
                double scaling = 1 - (opponentScore / (findBestScore(week)));
                double penalty = .1 * basePenalty * scaling;

                if (location.equals("home")) {
                    points *= 1.03;
                } else if (location.equals("away")) {
                    points *= .97;
                }

                losingPoints += penalty;
            }

            if (losingPoints > 0) {
                losingPoints = 0;
            }

            points += winningPoints + losingPoints;
            score = (int) (points);
            team.setScore(week, score);
        }
    }
}