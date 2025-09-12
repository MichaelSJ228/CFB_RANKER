package com.michaelsanchezjr228;

public class Team {

    final private String name;
    private String[] wonAgainst;
    private String[] lostAgainst;
    private int score;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getWonAgainst() {
        return wonAgainst;
    }

    public String[] getLostAgainst() {
        return lostAgainst;
    }

    public int getScore() {
        return score;
    }

}