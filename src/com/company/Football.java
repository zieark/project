package com.company;

/**
 * klasa dla pilki noznej
 */
public class Football {
    private String teamName;
    private int wins;
    private int draws;
    private int losses;
    private int goalsScored;
    private int goalsLost;

    /**
     * @param teamName - nazwa druzyny
     * @param wins - ilosc wygranych
     * @param draws - ilosc remisow
     * @param losses - ilosc porazek
     * @param goalsScored - ilosc strzelonych bramek
     * @param goalsLost - ilosc straconych bramek
     */
    public Football(String teamName, int wins, int draws, int losses, int goalsScored, int goalsLost) {
        this.teamName = teamName;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.goalsScored = goalsScored;
        this.goalsLost = goalsLost;
    }

    /**
     * @param teamName1 - nazwa pierwszej pobieranej druzyny
     * @param stars1 - ilosc gwiazdek pierwszej pobieranej druzyny
     * @param teamName2 - nazwa drugiej pobieranej druzyny
     * @param stars2 - ilosc gwiazdek drugiej pobieranej druzyny
     */
    public static void footballResult(String teamName1, int stars1, String teamName2, int stars2) {
        if(stars1>stars2)
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by "+teamName1);
        else if (stars2>stars1)
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be won by "+teamName2);
        else
            System.out.println("The game between "+teamName1+" and "+teamName2+" should be finished by draw");
    }

    /**
     * wyswietlanie statystyk odnosnie wybranego zespolu
     */
    public void showFootballStatistics() {
        double stars = (this.wins*3)+this.draws;
        double maxStars = (this.wins+this.draws+this.losses)*3;
        System.out.println("You chose "+this.teamName+" which won "+this.wins+" games, " +
                "draw "+this.draws+" games and lost "+this.losses+" games. They scored "+this.goalsScored+
                " goals and conceded "+this.goalsLost+".");
        System.out.println("In our rating they have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    /**
     * @return gwiazdki do wybrania lepszej druzyny
     */
    public double footballStars() {
        double stars = (this.wins*3)+this.draws;
        double maxStars = (this.wins+this.draws+this.losses)*3;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    /**
     * @return zwraca nazwe zespolu
     */
    public String showFootballTeamName() {
        return this.teamName;
    }
}
