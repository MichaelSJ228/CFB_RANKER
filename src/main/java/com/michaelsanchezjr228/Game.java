package com.michaelsanchezjr228;

public class Game {

    final private int week;
    final private boolean neutralSite;
    final private String homeName;
    final private String homeClass;
    final private int homeScore;
    final private String awayName;
    final private String awayClass;
    final private int awayScore;

    public Game(String week, String neutralSite, String homeName, String homeClass, String homeScore, String awayName,
            String awayClass, String awayScore) {
        this.week = Integer.parseInt(week);
        this.neutralSite = Boolean.parseBoolean(neutralSite);
        this.homeName = homeName;
        this.homeClass = homeClass;
        this.homeScore = Integer.parseInt(homeScore);
        this.awayName = awayName;
        this.awayClass = awayClass;
        this.awayScore = Integer.parseInt(awayScore);
    }

    public int getWeek() {
        return week;
    }

    public boolean isNeutralSite() {
        return neutralSite;
    }

    public String getHomeName() {
        if (homeClass.equals("fcs")) {
            return "FCS";
        }
        return homeName;
    }

    public String getHomeClass() {
        return homeClass;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public String getAwayName() {
        if (awayClass.equals("fcs")) {
            return "FCS";
        }
        return awayName;
    }

    public String getAwayClass() {
        return awayClass;
    }

    public int getAwayScore() {
        return awayScore;
    }
}