package com.michaelsanchezjr228;

import java.util.ArrayList;
import java.util.HashMap;

public class SavedData {

    private HashMap<String, Team> teams = new HashMap<>();
    private ArrayList<Game> games = new ArrayList<>();

    public HashMap<String, Team> getTeams() {
        return teams;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void addTeams() {
        int index = 0;
        while (teams.size() < 134 && index < games.size()) {
            if (games.get(index).getHomeClass() == "fbs") {
                teams.put(games.get(index).getHomeName(), new Team(games.get(index).getHomeName()));
            }
            if (games.get(index).getAwayClass() == "fbs") {
                teams.put(games.get(index).getAwayName(), new Team(games.get(index).getAwayName()));
            }
            index++;
        }
    }

    public void addgames(int week) {
        if (week < 0)
            return;
        games.add(new Game("0", "true", "Georgia Tech", "fbs", "24", "Florida State", "fbs", "21"));
        games.add(new Game("0", "false", "New Mexico", "fbs", "31", "Montana State", "fcs", "35"));
        games.add(new Game("0", "false", "Nevada", "fbs", "24", "SMU", "fbs", "29"));
        games.add(new Game("0", "false", "Hawai'i", "fbs", "35", "Delaware State", "fcs", "14"));
        if (week < 1)
            return;
        games.add(new Game("1", "false", "Rutgers", "fbs", "44", "Howard", "fcs", "7"));
        games.add(new Game("1", "false", "UL Monroe", "fbs", "30", "Jackson State", "fcs", "14"));
        games.add(new Game("1", "false", "Wake Forest", "fbs", "45", "North Carolina A&T", "fcs", "13"));
        games.add(new Game("1", "false", "NC State", "fbs", "38", "Western Carolina", "fcs", "21"));
        games.add(new Game("1", "false", "Bowling Green", "fbs", "41", "Fordham", "fcs", "17"));
        games.add(new Game("1", "false", "Buffalo", "fbs", "30", "Lafayette", "fcs", "13"));
        games.add(new Game("1", "false", "UCF", "fbs", "57", "New Hampshire", "fcs", "3"));
        games.add(new Game("1", "false", "Central Michigan", "fbs", "66", "Central Connecticut", "fcs", "10"));
        games.add(new Game("1", "true", "Arkansas", "fbs", "70", "Arkansas-Pine Bluff", "fcs", "0"));
        games.add(new Game("1", "false", "Toledo", "fbs", "49", "Duquesne", "fcs", "10"));
        games.add(new Game("1", "false", "Minnesota", "fbs", "17", "North Carolina", "fbs", "19"));
        games.add(new Game("1", "false", "Tulsa", "fbs", "62", "Northwestern State", "fcs", "28"));
        games.add(new Game("1", "false", "Tulane", "fbs", "52", "SE Louisiana", "fcs", "0"));
        games.add(new Game("1", "false", "Colorado", "fbs", "31", "North Dakota State", "fcs", "26"));
        games.add(new Game("1", "false", "Missouri", "fbs", "51", "Murray State", "fcs", "0"));
        games.add(new Game("1", "true", "Kansas", "fbs", "48", "Lindenwood", "fcs", "3"));
        games.add(new Game("1", "false", "UAB", "fbs", "41", "Alcorn State", "fcs", "3"));
        games.add(new Game("1", "false", "Jacksonville State", "fbs", "27", "Coastal Carolina", "fbs", "55"));
        games.add(new Game("1", "false", "Illinois", "fbs", "45", "Eastern Illinois", "fcs", "0"));
        games.add(new Game("1", "false", "Utah", "fbs", "49", "Southern Utah", "fcs", "0"));
        games.add(new Game("1", "false", "San José State", "fbs", "42", "Sacramento State", "fcs", "24"));
        games.add(new Game("1", "false", "Army", "fbs", "42", "Lehigh", "fcs", "7"));
        games.add(new Game("1", "false", "Oklahoma", "fbs", "51", "Temple", "fbs", "3"));
        games.add(new Game("1", "false", "Michigan State", "fbs", "16", "Florida Atlantic", "fbs", "10"));
        games.add(new Game("1", "false", "Duke", "fbs", "26", "Elon", "fcs", "3"));
        games.add(new Game("1", "false", "Wisconsin", "fbs", "28", "Western Michigan", "fbs", "14"));
        games.add(new Game("1", "false", "Stanford", "fbs", "27", "TCU", "fbs", "34"));
        games.add(new Game("1", "false", "Utah State", "fbs", "36", "Robert Morris", "fcs", "14"));
        games.add(new Game("1", "false", "Louisville", "fbs", "62", "Austin Peay", "fcs", "0"));
        games.add(new Game("1", "false", "Navy", "fbs", "49", "Bucknell", "fcs", "21"));
        games.add(new Game("1", "true", "Georgia", "fbs", "34", "Clemson", "fbs", "3"));
        games.add(new Game("1", "false", "West Virginia", "fbs", "12", "Penn State", "fbs", "34"));
        games.add(new Game("1", "false", "Vanderbilt", "fbs", "34", "Virginia Tech", "fbs", "27"));
        games.add(new Game("1", "false", "Maryland", "fbs", "50", "UConn", "fbs", "7"));
        games.add(new Game("1", "false", "Purdue", "fbs", "49", "Indiana State", "fcs", "0"));
        games.add(new Game("1", "false", "Iowa", "fbs", "40", "Illinois State", "fcs", "0"));
        games.add(new Game("1", "false", "Pittsburgh", "fbs", "55", "Kent State", "fbs", "24"));
        games.add(new Game("1", "false", "Tennessee", "fbs", "69", "Chattanooga", "fcs", "3"));
        games.add(new Game("1", "false", "Oklahoma State", "fbs", "44", "South Dakota State", "fcs", "20"));
        games.add(new Game("1", "false", "Cincinnati", "fbs", "38", "Towson", "fcs", "20"));
        games.add(new Game("1", "false", "Washington State", "fbs", "70", "Portland State", "fcs", "30"));
        games.add(new Game("1", "false", "Texas", "fbs", "52", "Colorado State", "fbs", "0"));
        games.add(new Game("1", "false", "Northern Illinois", "fbs", "54", "Western Illinois", "fcs", "15"));
        games.add(new Game("1", "false", "App State", "fbs", "38", "East Tennessee State", "fcs", "10"));
        games.add(new Game("1", "false", "Air Force", "fbs", "21", "Merrimack", "fcs", "6"));
        games.add(new Game("1", "false", "UTSA", "fbs", "28", "Kennesaw State", "fbs", "16"));
        games.add(new Game("1", "false", "Massachusetts", "fbs", "14", "Eastern Michigan", "fbs", "28"));
        games.add(new Game("1", "false", "Syracuse", "fbs", "38", "Ohio", "fbs", "22"));
        games.add(new Game("1", "false", "Iowa State", "fbs", "21", "North Dakota", "fcs", "3"));
        games.add(new Game("1", "false", "Ohio State", "fbs", "52", "Akron", "fbs", "6"));
        games.add(new Game("1", "false", "Nebraska", "fbs", "40", "UTEP", "fbs", "7"));
        games.add(new Game("1", "false", "Florida", "fbs", "17", "Miami", "fbs", "41"));
        games.add(new Game("1", "true", "Northwestern", "fbs", "13", "Miami (OH)", "fbs", "6"));
        games.add(new Game("1", "false", "Indiana", "fbs", "31", "Florida International", "fbs", "7"));
        games.add(new Game("1", "false", "Georgia Southern", "fbs", "45", "Boise State", "fbs", "56"));
        games.add(new Game("1", "false", "South Carolina", "fbs", "23", "Old Dominion", "fbs", "19"));
        games.add(new Game("1", "false", "Marshall", "fbs", "45", "Stony Brook", "fcs", "3"));
        games.add(new Game("1", "false", "South Alabama", "fbs", "38", "North Texas", "fbs", "52"));
        games.add(new Game("1", "false", "California", "fbs", "31", "UC Davis", "fcs", "13"));
        games.add(new Game("1", "false", "East Carolina", "fbs", "42", "Norfolk State", "fcs", "3"));
        games.add(new Game("1", "false", "Mississippi State", "fbs", "56", "Eastern Kentucky", "fcs", "7"));
        games.add(new Game("1", "false", "Liberty", "fbs", "41", "Campbell", "fcs", "24"));
        games.add(new Game("1", "false", "Virginia", "fbs", "34", "Richmond", "fcs", "13"));
        games.add(new Game("1", "false", "Oregon State", "fbs", "38", "Idaho State", "fcs", "15"));
        games.add(new Game("1", "false", "Alabama", "fbs", "63", "Western Kentucky", "fbs", "0"));
        games.add(new Game("1", "false", "Memphis", "fbs", "40", "North Alabama", "fcs", "0"));
        games.add(new Game("1", "false", "South Florida", "fbs", "48", "Bethune-Cookman", "fcs", "3"));
        games.add(new Game("1", "false", "Rice", "fbs", "14", "Sam Houston", "fbs", "34"));
        games.add(new Game("1", "false", "Arkansas State", "fbs", "34", "Central Arkansas", "fcs", "31"));
        games.add(new Game("1", "false", "Ole Miss", "fbs", "76", "Furman", "fcs", "0"));
        games.add(new Game("1", "false", "Kansas State", "fbs", "41", "UT Martin", "fcs", "6"));
        games.add(new Game("1", "false", "Baylor", "fbs", "45", "Tarleton State", "fcs", "3"));
        games.add(new Game("1", "false", "Troy", "fbs", "26", "Nevada", "fbs", "28"));
        games.add(new Game("1", "false", "Houston", "fbs", "7", "UNLV", "fbs", "27"));
        games.add(new Game("1", "false", "Middle Tennessee", "fbs", "32", "Tennessee Tech", "fcs", "25"));
        games.add(new Game("1", "false", "Hawai'i", "fbs", "13", "UCLA", "fbs", "16"));
        games.add(new Game("1", "false", "Texas Tech", "fbs", "52", "Abilene Christian", "fcs", "51"));
        games.add(new Game("1", "false", "Texas A&M", "fbs", "13", "Notre Dame", "fbs", "23"));
        games.add(new Game("1", "false", "Michigan", "fbs", "30", "Fresno State", "fbs", "10"));
        games.add(new Game("1", "false", "Auburn", "fbs", "73", "Alabama A&M", "fcs", "3"));
        games.add(new Game("1", "false", "Oregon", "fbs", "24", "Idaho", "fcs", "14"));
        games.add(new Game("1", "false", "Kentucky", "fbs", "31", "Southern Miss", "fbs", "0"));
        games.add(new Game("1", "false", "Charlotte", "fbs", "7", "James Madison", "fbs", "30"));
        games.add(new Game("1", "false", "SMU", "fbs", "59", "Houston Christian", "fcs", "7"));
        games.add(new Game("1", "false", "Georgia Tech", "fbs", "35", "Georgia State", "fbs", "12"));
        games.add(new Game("1", "false", "Louisiana", "fbs", "40", "Grambling", "fcs", "10"));
        games.add(new Game("1", "false", "Texas State", "fbs", "34", "Lamar", "fcs", "27"));
        games.add(new Game("1", "false", "Louisiana Tech", "fbs", "25", "Nicholls", "fcs", "17"));
        games.add(new Game("1", "false", "San Diego State", "fbs", "45", "East Texas A&M", "fcs", "14"));
        games.add(new Game("1", "false", "BYU", "fbs", "41", "Southern Illinois", "fcs", "13"));
        games.add(new Game("1", "false", "New Mexico State", "fbs", "23", "Southeast Missouri State", "fcs", "16"));
        games.add(new Game("1", "false", "Arizona", "fbs", "61", "New Mexico", "fbs", "39"));
        games.add(new Game("1", "false", "Arizona State", "fbs", "48", "Wyoming", "fbs", "7"));
        games.add(new Game("1", "false", "Washington", "fbs", "35", "Weber State", "fcs", "3"));
        games.add(new Game("1", "true", "LSU", "fbs", "20", "USC", "fbs", "27"));
        games.add(new Game("1", "false", "Florida State", "fbs", "13", "Boston College", "fbs", "28"));
    }

}