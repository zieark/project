package com.company;

public class Volleyball {
    private String teamName;
    private int wins;
    private int losses;
    private int winsIn5Sets;
    private int lossesIn5Sets;
    private int points;
    private int setsWon;
    private int setsLosses;

    public Volleyball(String teamName, int wins, int losses, int winsIn5Sets, int lossesIn5Sets, int points, int setsWon, int setsLosses) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.winsIn5Sets = winsIn5Sets;
        this.lossesIn5Sets = lossesIn5Sets;
        this.points = points;
        this.setsWon = setsWon;
        this.setsLosses = setsLosses;
    }

    public static void result(String teamName1, double stars1, String teamName2, double stars2) {
        if(stars1>stars2)
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by "+teamName1);
        else if (stars2>stars1)
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by "+teamName2);
        else
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be finished by draw");
    }

    @Override
    public String toString() {
        return "Volleyball{" +
                "teamName='" + teamName + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", winsIn5Sets=" + winsIn5Sets +
                ", lossesIn5Sets=" + lossesIn5Sets +
                ", points=" + points +
                ", setsWon=" + setsWon +
                ", setsLosses=" + setsLosses +
                '}';
    }

    public void showStatistics() {
        int stars = this.wins*5-this.winsIn5Sets*2+this.lossesIn5Sets;
        int maxStars = (this.wins+this.losses)*5;
        System.out.println("You chose "+this.teamName+" which won "+this.wins+" games " +
                        "("+winsIn5Sets+" in 5 sets) and lost "+this.losses+
                        " games ("+lossesIn5Sets+" in 5 sets. They won "+setsWon+" sets and lost "+setsLosses+".");
        System.out.println("In our rating they have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    public double stars() {
        double stars = this.wins*5-this.winsIn5Sets*2+this.lossesIn5Sets;
        double maxStars = (this.wins+this.losses)*5;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    public String showTeamName() {
        return this.teamName;
    }
}
