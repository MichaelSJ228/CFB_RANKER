package com.michaelsanchezjr228;

import java.util.ArrayList;
import java.util.HashMap;

public class Team {

    final private String name;
    private HashMap<String, String> wonAgainst = new HashMap<>();
    private HashMap<String, String> lostAgainst = new HashMap<>();
    private ArrayList<Integer> score = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        for (int index = 0; index <= Data.getCurrentWeek() + 1; index++) {
            if (name.equals("FCS")) {
                this.score.add(0, Data.getFCSWins());
                continue;
            }
            this.score.add(Data.getFBSTeams());
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getWonAgainst() {
        return wonAgainst;
    }

    public HashMap<String, String> getLostAgainst() {
        return lostAgainst;
    }

    public int getScore(int pre_week) {
        if (score.get(pre_week) < 0) {
            return 0;
        }
        return score.get(pre_week);
    }

    public void addWonAgainst(String name, String location) {
        wonAgainst.put(name, location);
    }

    public void addLostAgainst(String name, String location) {
        lostAgainst.put(name, location);
    }

    public void setScore(int week, int points) {
        score.set(week + 1, points);
    }
}