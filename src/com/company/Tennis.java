package com.company;

public class Tennis {
    private String playerName;
    private int wins;
    private int tournamentWon;
    private int losses;

    public Tennis(String playerName, int wins, int tournamentWon, int losses) {
        this.playerName = playerName;
        this.wins = wins;
        this.tournamentWon = tournamentWon;
        this.losses = losses;
    }

    public static void result(String playerName1, double stars1, String playerName2, double stars2) {
        if(stars1>stars2)
            System.out.println("The game between "+playerName1+" and "+playerName2+" should be won by "+playerName1);
        else if (stars2>stars1)
            System.out.println("The game between "+playerName1+" and "+playerName2+" should be won by "+playerName2);
        else
            System.out.println("The game between "+playerName1+" and "+playerName2+" should be won by luckily team :)");
    }

    public void showStatistics() {
        int stars = this.wins*5-this.losses*3+this.tournamentWon*50;
        int maxStars = (this.losses+this.tournamentWon)*50;
        System.out.println("You chose "+this.playerName+" which won "+this.wins+" games and lost "
                +this.losses+" games. He/She won also "+this.tournamentWon+" tournaments.");
        System.out.println("In our rating he/she have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    public double stars() {
        double stars = this.wins*5-this.losses*3+this.tournamentWon*50;
        double maxStars = (this.losses+this.tournamentWon)*50;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    public String showPlayerName() {
        return this.playerName;
    }
}

