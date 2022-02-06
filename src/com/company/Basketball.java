package com.company;

public class Basketball {
    private String teamName;
    private int wins;
    private int losses;
    private int pointsScored;
    private int pointsConceded;

    public Basketball(String teamName, int wins, int losses, int pointsScored, int pointsConceded) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.pointsScored = pointsScored;
        this.pointsConceded = pointsConceded;
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
        return "Football{" +
                "teamName='" + teamName + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", goalsScored=" + pointsScored +
                ", goalsLost=" + pointsConceded +
                '}';
    }

    public void showStatistics() {
        int stars = this.wins*2-this.losses;
        int maxStars = (this.wins+this.losses)*2;
        System.out.println("You chose "+this.teamName+" which won "+this.wins+" games and lost "
                +this.losses+" games. They scored "+this.pointsScored+
                " points and conceded "+this.pointsConceded+".");
        System.out.println("In our rating they have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    public double stars() {
        double stars = this.wins*2-this.losses;
        double maxStars = (this.wins+this.losses)*2;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    public String showTeamName() {
        return this.teamName;
    }
}
