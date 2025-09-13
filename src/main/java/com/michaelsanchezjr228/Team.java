package com.michaelsanchezjr228;

import java.util.ArrayList;

public class Team {

    final private String name;
    private ArrayList<String> wonAgainst = new ArrayList<>();
    private ArrayList<String> lostAgainst = new ArrayList<>();
    private ArrayList<Integer> score = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.score.set(0, Data.getFBSTeams());
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getWonAgainst() {
        return wonAgainst;
    }

    public ArrayList<String> getLostAgainst() {
        return lostAgainst;
    }

    public int getScore(int pre_week) {
        return score.get(pre_week);
    }

    public void addWonAgainst(String name) {
        wonAgainst.add(name);
    }

    public void addLostAgainst(String name) {
        lostAgainst.add(name);
    }

    public void addScore(int week, int points) {
        score.set(week + 1, score.get(week + 1) + points);
    }
}