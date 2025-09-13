package com.michaelsanchezjr228;

public class Data {

    private final static int FBS_TEAMS = 134;
    private final static int FCS_WINS = 6;

    public static int getFBSTeams() {
        return FBS_TEAMS;
    }

    public static int getFCSWins() {
        return FCS_WINS;
    }

    public static void addGames(int week) {
        Calculations.resetGames();
        if (week == 0) {
            Calculations.addGame("0", "true", "Georgia Tech", "fbs", "24", "Florida State", "fbs", "21");
            Calculations.addGame("0", "false", "New Mexico", "fbs", "31", "Montana State", "fcs", "35");
            Calculations.addGame("0", "false", "Nevada", "fbs", "24", "SMU", "fbs", "29");
            Calculations.addGame("0", "false", "Hawai'i", "fbs", "35", "Delaware State", "fcs", "14");
        }
        if (week == 1) {
            Calculations.addGame("1", "false", "Rutgers", "fbs", "44", "Howard", "fcs", "7");
            Calculations.addGame("1", "false", "UL Monroe", "fbs", "30", "Jackson State", "fcs", "14");
            Calculations.addGame("1", "false", "Wake Forest", "fbs", "45", "North Carolina A&T", "fcs", "13");
            Calculations.addGame("1", "false", "NC State", "fbs", "38", "Western Carolina", "fcs", "21");
            Calculations.addGame("1", "false", "Bowling Green", "fbs", "41", "Fordham", "fcs", "17");
            Calculations.addGame("1", "false", "Buffalo", "fbs", "30", "Lafayette", "fcs", "13");
            Calculations.addGame("1", "false", "UCF", "fbs", "57", "New Hampshire", "fcs", "3");
            Calculations.addGame("1", "false", "Central Michigan", "fbs", "66", "Central Connecticut", "fcs", "10");
            Calculations.addGame("1", "true", "Arkansas", "fbs", "70", "Arkansas-Pine Bluff", "fcs", "0");
            Calculations.addGame("1", "false", "Toledo", "fbs", "49", "Duquesne", "fcs", "10");
            Calculations.addGame("1", "false", "Minnesota", "fbs", "17", "North Carolina", "fbs", "19");
            Calculations.addGame("1", "false", "Tulsa", "fbs", "62", "Northwestern State", "fcs", "28");
            Calculations.addGame("1", "false", "Tulane", "fbs", "52", "SE Louisiana", "fcs", "0");
            Calculations.addGame("1", "false", "Colorado", "fbs", "31", "North Dakota State", "fcs", "26");
            Calculations.addGame("1", "false", "Missouri", "fbs", "51", "Murray State", "fcs", "0");
            Calculations.addGame("1", "true", "Kansas", "fbs", "48", "Lindenwood", "fcs", "3");
            Calculations.addGame("1", "false", "UAB", "fbs", "41", "Alcorn State", "fcs", "3");
            Calculations.addGame("1", "false", "Jacksonville State", "fbs", "27", "Coastal Carolina", "fbs", "55");
            Calculations.addGame("1", "false", "Illinois", "fbs", "45", "Eastern Illinois", "fcs", "0");
            Calculations.addGame("1", "false", "Utah", "fbs", "49", "Southern Utah", "fcs", "0");
            Calculations.addGame("1", "false", "San José State", "fbs", "42", "Sacramento State", "fcs", "24");
            Calculations.addGame("1", "false", "Army", "fbs", "42", "Lehigh", "fcs", "7");
            Calculations.addGame("1", "false", "Oklahoma", "fbs", "51", "Temple", "fbs", "3");
            Calculations.addGame("1", "false", "Michigan State", "fbs", "16", "Florida Atlantic", "fbs", "10");
            Calculations.addGame("1", "false", "Duke", "fbs", "26", "Elon", "fcs", "3");
            Calculations.addGame("1", "false", "Wisconsin", "fbs", "28", "Western Michigan", "fbs", "14");
            Calculations.addGame("1", "false", "Stanford", "fbs", "27", "TCU", "fbs", "34");
            Calculations.addGame("1", "false", "Utah State", "fbs", "36", "Robert Morris", "fcs", "14");
            Calculations.addGame("1", "false", "Louisville", "fbs", "62", "Austin Peay", "fcs", "0");
            Calculations.addGame("1", "false", "Navy", "fbs", "49", "Bucknell", "fcs", "21");
            Calculations.addGame("1", "true", "Georgia", "fbs", "34", "Clemson", "fbs", "3");
            Calculations.addGame("1", "false", "West Virginia", "fbs", "12", "Penn State", "fbs", "34");
            Calculations.addGame("1", "false", "Vanderbilt", "fbs", "34", "Virginia Tech", "fbs", "27");
            Calculations.addGame("1", "false", "Maryland", "fbs", "50", "UConn", "fbs", "7");
            Calculations.addGame("1", "false", "Purdue", "fbs", "49", "Indiana State", "fcs", "0");
            Calculations.addGame("1", "false", "Iowa", "fbs", "40", "Illinois State", "fcs", "0");
            Calculations.addGame("1", "false", "Pittsburgh", "fbs", "55", "Kent State", "fbs", "24");
            Calculations.addGame("1", "false", "Tennessee", "fbs", "69", "Chattanooga", "fcs", "3");
            Calculations.addGame("1", "false", "Oklahoma State", "fbs", "44", "South Dakota State", "fcs", "20");
            Calculations.addGame("1", "false", "Cincinnati", "fbs", "38", "Towson", "fcs", "20");
            Calculations.addGame("1", "false", "Washington State", "fbs", "70", "Portland State", "fcs", "30");
            Calculations.addGame("1", "false", "Texas", "fbs", "52", "Colorado State", "fbs", "0");
            Calculations.addGame("1", "false", "Northern Illinois", "fbs", "54", "Western Illinois", "fcs", "15");
            Calculations.addGame("1", "false", "App State", "fbs", "38", "East Tennessee State", "fcs", "10");
            Calculations.addGame("1", "false", "Air Force", "fbs", "21", "Merrimack", "fcs", "6");
            Calculations.addGame("1", "false", "UTSA", "fbs", "28", "Kennesaw State", "fbs", "16");
            Calculations.addGame("1", "false", "Massachusetts", "fbs", "14", "Eastern Michigan", "fbs", "28");
            Calculations.addGame("1", "false", "Syracuse", "fbs", "38", "Ohio", "fbs", "22");
            Calculations.addGame("1", "false", "Iowa State", "fbs", "21", "North Dakota", "fcs", "3");
            Calculations.addGame("1", "false", "Ohio State", "fbs", "52", "Akron", "fbs", "6");
            Calculations.addGame("1", "false", "Nebraska", "fbs", "40", "UTEP", "fbs", "7");
            Calculations.addGame("1", "false", "Florida", "fbs", "17", "Miami", "fbs", "41");
            Calculations.addGame("1", "true", "Northwestern", "fbs", "13", "Miami (OH)", "fbs", "6");
            Calculations.addGame("1", "false", "Indiana", "fbs", "31", "Florida International", "fbs", "7");
            Calculations.addGame("1", "false", "Georgia Southern", "fbs", "45", "Boise State", "fbs", "56");
            Calculations.addGame("1", "false", "South Carolina", "fbs", "23", "Old Dominion", "fbs", "19");
            Calculations.addGame("1", "false", "Marshall", "fbs", "45", "Stony Brook", "fcs", "3");
            Calculations.addGame("1", "false", "South Alabama", "fbs", "38", "North Texas", "fbs", "52");
            Calculations.addGame("1", "false", "California", "fbs", "31", "UC Davis", "fcs", "13");
            Calculations.addGame("1", "false", "East Carolina", "fbs", "42", "Norfolk State", "fcs", "3");
            Calculations.addGame("1", "false", "Mississippi State", "fbs", "56", "Eastern Kentucky", "fcs", "7");
            Calculations.addGame("1", "false", "Liberty", "fbs", "41", "Campbell", "fcs", "24");
            Calculations.addGame("1", "false", "Virginia", "fbs", "34", "Richmond", "fcs", "13");
            Calculations.addGame("1", "false", "Oregon State", "fbs", "38", "Idaho State", "fcs", "15");
            Calculations.addGame("1", "false", "Alabama", "fbs", "63", "Western Kentucky", "fbs", "0");
            Calculations.addGame("1", "false", "Memphis", "fbs", "40", "North Alabama", "fcs", "0");
            Calculations.addGame("1", "false", "South Florida", "fbs", "48", "Bethune-Cookman", "fcs", "3");
            Calculations.addGame("1", "false", "Rice", "fbs", "14", "Sam Houston", "fbs", "34");
            Calculations.addGame("1", "false", "Arkansas State", "fbs", "34", "Central Arkansas", "fcs", "31");
            Calculations.addGame("1", "false", "Ole Miss", "fbs", "76", "Furman", "fcs", "0");
            Calculations.addGame("1", "false", "Kansas State", "fbs", "41", "UT Martin", "fcs", "6");
            Calculations.addGame("1", "false", "Baylor", "fbs", "45", "Tarleton State", "fcs", "3");
            Calculations.addGame("1", "false", "Troy", "fbs", "26", "Nevada", "fbs", "28");
            Calculations.addGame("1", "false", "Houston", "fbs", "7", "UNLV", "fbs", "27");
            Calculations.addGame("1", "false", "Middle Tennessee", "fbs", "32", "Tennessee Tech", "fcs", "25");
            Calculations.addGame("1", "false", "Hawai'i", "fbs", "13", "UCLA", "fbs", "16");
            Calculations.addGame("1", "false", "Texas Tech", "fbs", "52", "Abilene Christian", "fcs", "51");
            Calculations.addGame("1", "false", "Texas A&M", "fbs", "13", "Notre Dame", "fbs", "23");
            Calculations.addGame("1", "false", "Michigan", "fbs", "30", "Fresno State", "fbs", "10");
            Calculations.addGame("1", "false", "Auburn", "fbs", "73", "Alabama A&M", "fcs", "3");
            Calculations.addGame("1", "false", "Oregon", "fbs", "24", "Idaho", "fcs", "14");
            Calculations.addGame("1", "false", "Kentucky", "fbs", "31", "Southern Miss", "fbs", "0");
            Calculations.addGame("1", "false", "Charlotte", "fbs", "7", "James Madison", "fbs", "30");
            Calculations.addGame("1", "false", "SMU", "fbs", "59", "Houston Christian", "fcs", "7");
            Calculations.addGame("1", "false", "Georgia Tech", "fbs", "35", "Georgia State", "fbs", "12");
            Calculations.addGame("1", "false", "Louisiana", "fbs", "40", "Grambling", "fcs", "10");
            Calculations.addGame("1", "false", "Texas State", "fbs", "34", "Lamar", "fcs", "27");
            Calculations.addGame("1", "false", "Louisiana Tech", "fbs", "25", "Nicholls", "fcs", "17");
            Calculations.addGame("1", "false", "San Diego State", "fbs", "45", "East Texas A&M", "fcs", "14");
            Calculations.addGame("1", "false", "BYU", "fbs", "41", "Southern Illinois", "fcs", "13");
            Calculations.addGame("1", "false", "New Mexico State", "fbs", "23", "Southeast Missouri State", "fcs",
                    "16");
            Calculations.addGame("1", "false", "Arizona", "fbs", "61", "New Mexico", "fbs", "39");
            Calculations.addGame("1", "false", "Arizona State", "fbs", "48", "Wyoming", "fbs", "7");
            Calculations.addGame("1", "false", "Washington", "fbs", "35", "Weber State", "fcs", "3");
            Calculations.addGame("1", "true", "LSU", "fbs", "20", "USC", "fbs", "27");
            Calculations.addGame("1", "false", "Florida State", "fbs", "13", "Boston College", "fbs", "28");
        }
        if (week == 2) {
            Calculations.addGame("2", "false", "SMU", "fbs", "15", "BYU", "fbs", "18");
            Calculations.addGame("2", "false", "Indiana", "fbs", "77", "Western Illinois", "fcs", "3");
            Calculations.addGame("2", "true", "Northwestern", "fbs", "20", "Duke", "fbs", "26");
            Calculations.addGame("2", "false", "Cincinnati", "fbs", "27", "Pittsburgh", "fbs", "28");
            Calculations.addGame("2", "false", "UConn", "fbs", "63", "Merrimack", "fcs", "17");
            Calculations.addGame("2", "false", "Memphis", "fbs", "38", "Troy", "fbs", "17");
            Calculations.addGame("2", "false", "Florida Atlantic", "fbs", "7", "Army", "fbs", "24");
            Calculations.addGame("2", "false", "Michigan", "fbs", "12", "Texas", "fbs", "31");
            Calculations.addGame("2", "false", "Penn State", "fbs", "34", "Bowling Green", "fbs", "27");
            Calculations.addGame("2", "false", "Syracuse", "fbs", "31", "Georgia Tech", "fbs", "28");
            Calculations.addGame("2", "false", "Rutgers", "fbs", "49", "Akron", "fbs", "17");
            Calculations.addGame("2", "false", "Minnesota", "fbs", "48", "Rhode Island", "fcs", "0");
            Calculations.addGame("2", "false", "Oklahoma State", "fbs", "39", "Arkansas", "fbs", "31");
            Calculations.addGame("2", "false", "Tulane", "fbs", "27", "Kansas State", "fbs", "34");
            Calculations.addGame("2", "false", "Texas A&M", "fbs", "52", "McNeese", "fcs", "10");
            Calculations.addGame("2", "false", "Ball State", "fbs", "42", "Missouri State", "fcs", "34");
            Calculations.addGame("2", "false", "Georgia", "fbs", "48", "Tennessee Tech", "fcs", "3");
            Calculations.addGame("2", "false", "Kent State", "fbs", "17", "St. Francis (PA)", "fcs", "23");
            Calculations.addGame("2", "false", "UNLV", "fbs", "72", "Utah Tech", "fcs", "14");
            Calculations.addGame("2", "false", "Toledo", "fbs", "38", "Massachusetts", "fbs", "23");
            Calculations.addGame("2", "false", "Wyoming", "fbs", "13", "Idaho", "fcs", "17");
            Calculations.addGame("2", "false", "Boston College", "fbs", "56", "Duquesne", "fcs", "0");
            Calculations.addGame("2", "false", "Notre Dame", "fbs", "14", "Northern Illinois", "fbs", "16");
            Calculations.addGame("2", "false", "Navy", "fbs", "38", "Temple", "fbs", "11");
            Calculations.addGame("2", "false", "Wisconsin", "fbs", "27", "South Dakota", "fcs", "13");
            Calculations.addGame("2", "false", "Utah", "fbs", "23", "Baylor", "fbs", "12");
            Calculations.addGame("2", "false", "Iowa", "fbs", "19", "Iowa State", "fbs", "20");
            Calculations.addGame("2", "false", "Louisville", "fbs", "49", "Jacksonville State", "fbs", "14");
            Calculations.addGame("2", "false", "Auburn", "fbs", "14", "California", "fbs", "21");
            Calculations.addGame("2", "false", "Kentucky", "fbs", "6", "South Carolina", "fbs", "31");
            Calculations.addGame("2", "false", "Maryland", "fbs", "24", "Michigan State", "fbs", "27");
            Calculations.addGame("2", "false", "Washington", "fbs", "30", "Eastern Michigan", "fbs", "9");
            Calculations.addGame("2", "false", "North Carolina", "fbs", "38", "Charlotte", "fbs", "20");
            Calculations.addGame("2", "false", "Texas State", "fbs", "49", "UTSA", "fbs", "10");
            Calculations.addGame("2", "false", "Ole Miss", "fbs", "52", "Middle Tennessee", "fbs", "3");
            Calculations.addGame("2", "false", "Virginia Tech", "fbs", "31", "Marshall", "fbs", "14");
            Calculations.addGame("2", "false", "Ohio", "fbs", "27", "South Alabama", "fbs", "20");
            Calculations.addGame("2", "false", "Miami", "fbs", "56", "Florida A&M", "fcs", "9");
            Calculations.addGame("2", "true", "Florida International", "fbs", "52", "Central Michigan", "fbs", "16");
            Calculations.addGame("2", "false", "Old Dominion", "fbs", "14", "East Carolina", "fbs", "20");
            Calculations.addGame("2", "false", "West Virginia", "fbs", "49", "UAlbany", "fcs", "14");
            Calculations.addGame("2", "false", "James Madison", "fbs", "13", "Gardner-Webb", "fcs", "6");
            Calculations.addGame("2", "false", "UCF", "fbs", "45", "Sam Houston", "fbs", "14");
            Calculations.addGame("2", "false", "Nevada", "fbs", "17", "Georgia Southern", "fbs", "20");
            Calculations.addGame("2", "false", "Arkansas State", "fbs", "28", "Tulsa", "fbs", "24");
            Calculations.addGame("2", "false", "UL Monroe", "fbs", "32", "UAB", "fbs", "6");
            Calculations.addGame("2", "false", "Air Force", "fbs", "7", "San José State", "fbs", "17");
            Calculations.addGame("2", "false", "Illinois", "fbs", "23", "Kansas", "fbs", "17");
            Calculations.addGame("2", "false", "Missouri", "fbs", "38", "Buffalo", "fbs", "0");
            Calculations.addGame("2", "false", "Alabama", "fbs", "42", "South Florida", "fbs", "16");
            Calculations.addGame("2", "false", "Georgia State", "fbs", "24", "Chattanooga", "fcs", "21");
            Calculations.addGame("2", "false", "Florida", "fbs", "45", "Samford", "fcs", "7");
            Calculations.addGame("2", "false", "Coastal Carolina", "fbs", "40", "William & Mary", "fcs", "21");
            Calculations.addGame("2", "false", "Western Kentucky", "fbs", "31", "Eastern Kentucky", "fcs", "0");
            Calculations.addGame("2", "false", "Stanford", "fbs", "41", "Cal Poly", "fcs", "7");
            Calculations.addGame("2", "false", "Colorado State", "fbs", "38", "Northern Colorado", "fcs", "17");
            Calculations.addGame("2", "false", "Southern Miss", "fbs", "35", "SE Louisiana", "fcs", "10");
            Calculations.addGame("2", "false", "Rice", "fbs", "69", "Texas Southern", "fcs", "7");
            Calculations.addGame("2", "false", "Wake Forest", "fbs", "30", "Virginia", "fbs", "31");
            Calculations.addGame("2", "false", "Kennesaw State", "fbs", "10", "Louisiana", "fbs", "34");
            Calculations.addGame("2", "false", "Ohio State", "fbs", "56", "Western Michigan", "fbs", "0");
            Calculations.addGame("2", "false", "North Texas", "fbs", "35", "Stephen F. Austin", "fcs", "20");
            Calculations.addGame("2", "false", "LSU", "fbs", "44", "Nicholls", "fcs", "21");
            Calculations.addGame("2", "true", "NC State", "fbs", "10", "Tennessee", "fbs", "51");
            Calculations.addGame("2", "false", "Vanderbilt", "fbs", "55", "Alcorn State", "fcs", "0");
            Calculations.addGame("2", "false", "Nebraska", "fbs", "28", "Colorado", "fbs", "10");
            Calculations.addGame("2", "false", "Oklahoma", "fbs", "16", "Houston", "fbs", "12");
            Calculations.addGame("2", "false", "TCU", "fbs", "45", "Long Island University", "fcs", "0");
            Calculations.addGame("2", "false", "Clemson", "fbs", "66", "App State", "fbs", "20");
            Calculations.addGame("2", "false", "UTEP", "fbs", "24", "Southern Utah", "fcs", "27");
            Calculations.addGame("2", "false", "Oregon", "fbs", "37", "Boise State", "fbs", "34");
            Calculations.addGame("2", "false", "Fresno State", "fbs", "46", "Sacramento State", "fcs", "30");
            Calculations.addGame("2", "false", "Washington State", "fbs", "37", "Texas Tech", "fbs", "16");
            Calculations.addGame("2", "false", "Arizona", "fbs", "22", "Northern Arizona", "fcs", "10");
            Calculations.addGame("2", "false", "New Mexico State", "fbs", "24", "Liberty", "fbs", "30");
            Calculations.addGame("2", "false", "San Diego State", "fbs", "0", "Oregon State", "fbs", "21");
            Calculations.addGame("2", "false", "Arizona State", "fbs", "30", "Mississippi State", "fbs", "23");
            Calculations.addGame("2", "false", "USC", "fbs", "48", "Utah State", "fbs", "0");
        }
    }
}