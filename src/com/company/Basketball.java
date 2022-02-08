package com.company;

/**
 * klasa dla koszykowki
 */
public class Basketball {
    private String teamName;
    private int wins;
    private int losses;
    private int pointsScored;
    private int pointsConceded;

    /**
     * @param teamName - nazwa druzyny
     * @param wins - ilosc wygranych
     * @param losses - ilosc przegranych
     * @param pointsScored - ilosc zdobytych punktów
     * @param pointsConceded - ilosc straconych punktów
     */
    public Basketball(String teamName, int wins, int losses, int pointsScored, int pointsConceded) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.pointsScored = pointsScored;
        this.pointsConceded = pointsConceded;
    }

    /**
     * @param teamName1 - nazwa pierwszej pobieranej druzyny
     * @param stars1 - ilosc gwiazdek pierwszej pobieranej druzyny
     * @param teamName2 - nazwa drugiej pobieranej druzyny
     * @param stars2 - ilosc gwiazdek drugiej pobieranej druzyny
     */
    public static void basketballResult(String teamName1, double stars1, String teamName2, double stars2) {
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
    public void showBasketballStatistics() {
        double stars = this.wins*2-this.losses;
        double maxStars = (this.wins+this.losses)*2;
        System.out.println("You chose "+this.teamName+" which won "+this.wins+" games and lost "
                +this.losses+" games. They scored "+this.pointsScored+
                " points and conceded "+this.pointsConceded+".");
        System.out.println("In our rating they have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    /**
     * @return wspolczynnik gwiazdek do wybrania lepszej druzyny
     */
    public double basketballStars() {
        double stars = this.wins*2-this.losses;
        double maxStars = (this.wins+this.losses)*2;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    /**
     * @return zwraca nazwe zespolu
     */
    public String showBasketballTeamName() {
        return this.teamName;
    }
}
