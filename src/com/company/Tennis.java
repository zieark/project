package com.company;

/**
 * klasa dla tenisa
 */

public class Tennis {
    private String playerName;
    private int wins;
    private int tournamentWon;
    private int losses;

    /**
     * @param playerName - nazwa zawodnika
     * @param wins - ilosc wygranych meczow
     * @param tournamentWon - ilosc wygranych turniejow
     * @param losses - ilosc porazek
     */
    public Tennis(String playerName, int wins, int tournamentWon, int losses) {
        this.playerName = playerName;
        this.wins = wins;
        this.tournamentWon = tournamentWon;
        this.losses = losses;
    }

    /**
     * @param playerName1 - nazwa pierwszej pobieranej druzyny
     * @param stars1 - ilosc gwiazdek pierwszej pobieranej druzyny
     * @param playerName2 - nazwa drugiej pobieranej druzyny
     * @param stars2 - ilosc gwiazdek drugiej pobieranej druzyny
     */
    public static void tennisResult(String playerName1, double stars1, String playerName2, double stars2) {
        if(stars1>stars2)
            System.out.println("The game between "+playerName1+" and "+playerName2+" should be won by "+playerName1);
        else if (stars2>stars1)
            System.out.println("The game between "+playerName1+" and "+playerName2+" should be won by "+playerName2);
        else
            System.out.println("The game between "+playerName1+" and "+playerName2+" should be won by luckily team :)");
    }

    /**
     * wyswietlanie statystyk odnosnie wybranego zawodnika
     */
    public void showTennisStatistics() {
        double stars = this.wins*5-this.losses*3+this.tournamentWon*50;
        double maxStars = (this.losses+this.tournamentWon)*50;
        System.out.println("You chose "+this.playerName+" which won "+this.wins+" games and lost "
                +this.losses+" games. He/She won also "+this.tournamentWon+" tournaments.");
        System.out.println("In our rating he/she have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    /**
     * @return wspolczynnik gwiazdek do wybrania lepszego zawodnika
     */
    public double tennisStars() {
        double stars = this.wins*5-this.losses*3+this.tournamentWon*50;
        double maxStars = (this.losses+this.tournamentWon)*50;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    /**
     * @return zwraca nazwe zawodnika
     */
    public String showTennisPlayerName() {
        return this.playerName;
    }
}

