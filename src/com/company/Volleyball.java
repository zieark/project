package com.company;

/**
 * Klasa dla siatkowki
 */
public class Volleyball {
    private String teamName;
    private int wins;
    private int losses;
    private int winsIn5Sets;
    private int lossesIn5Sets;
    private int points;
    private int setsWon;
    private int setsLosses;

    /**
     * @param teamName - nazwa druzyny
     * @param wins - ilosc wygranych
     * @param losses - ilosc porazek
     * @param winsIn5Sets - ilosc wygranych w 5 setach
     * @param lossesIn5Sets - ilosc porazek w 5 setach
     * @param points - ilosc punktow
     * @param setsWon - ilosc wygranych setow
     * @param setsLosses - ilosc przegranych setow
     */
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

    /**
     * @param teamName1 - nazwa pierwszej pobieranej druzyny
     * @param stars1 - ilosc gwiazdek pierwszej pobieranej druzyny
     * @param teamName2 - nazwa drugiej pobieranej druzyny
     * @param stars2 - ilosc gwiazdek drugiej pobieranej druzyny
     */
    public static void volleyballResult(String teamName1, double stars1, String teamName2, double stars2) {
        if(stars1>stars2)
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by "+teamName1);
        else if (stars2>stars1)
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by "+teamName2);
        else
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by luckily team :)");
    }

    /**
     * wyswietlanie statystyk odnosnie wybranego zespolu
     */
    public void showVolleyballStatistics() {
        double stars = this.wins*5-this.winsIn5Sets*2+this.lossesIn5Sets;
        double maxStars = (this.wins+this.losses)*5;
        System.out.println("You chose "+this.teamName+" which won "+this.wins+" games " +
                        "("+winsIn5Sets+" in 5 sets) and lost "+this.losses+
                        " games ("+lossesIn5Sets+" in 5 sets. They won "+setsWon+" sets and lost "+setsLosses+".");
        System.out.println("In our rating they have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    /**
     * @return wspolczynnik gwiazdek do wybrania lepszej druzyny
     */
    public double volleyballStars() {
        double stars = this.wins*5-this.winsIn5Sets*2+this.lossesIn5Sets;
        double maxStars = (this.wins+this.losses)*5;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    /**
     * @return zwraca nazwe zespolu
     */
    public String showVolleyballTeamName() {
        return this.teamName;
    }
}
