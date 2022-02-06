package com.company;

public class Football {
    private String teamName;
    private int wins;
    private int draws;
    private int losses;
    private int goalsScored;
    private int goalsLost;

    public Football(String teamName, int wins, int draws, int losses, int goalsScored, int goalsLost) {
        this.teamName = teamName;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.goalsScored = goalsScored;
        this.goalsLost = goalsLost;
    }

    public static void result(String teamName1, int stars1, String teamName2, int stars2) {
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
                ", draws=" + draws +
                ", losses=" + losses +
                ", goalsScored=" + goalsScored +
                ", goalsLost=" + goalsLost +
                '}';
    }

    public void showStatistics() {
        int stars = (this.wins*3)+this.draws;
        int maxStars = (this.wins+this.draws+this.losses)*3;
        System.out.println("You chose "+this.teamName+" which won "+this.wins+" games, " +
                "draw "+this.draws+" games and lost "+this.losses+" games. They scored "+this.goalsScored+
                " goals and conceded "+this.goalsLost+".");
        System.out.println("In our rating they have "+stars+"/"+maxStars+" stars");
    }

    public int stars() {
        int stars = (this.wins*3)+this.draws;
        int maxStars = (this.wins+this.draws+this.losses)*3;
        return stars;
    }

    public String showTeamName() {
        return this.teamName;
    }
}
