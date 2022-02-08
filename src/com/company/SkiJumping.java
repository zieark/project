package com.company;

/**
 * klasa dla skokow narciarskich
 */

public class SkiJumping {
    private String jumperName;
    private int lastPlace;
    private int lastPlace2;
    private int lastPlace3;
    private int lastPlace4;
    private int lastPlace5;

    /**
     * @param jumperName - nazwa skoczka
     * @param lastPlace - miejsce w ostatnich zawodach
     * @param lastPlace2 - miejsce w przedostatnich zawodach
     * @param lastPlace3 - miejsce w zawodach 3 tygodnie temu
     * @param lastPlace4 - miejsce w zawodach 4 tygodnie temu
     * @param lastPlace5 - miejsce w zawodach 5 tygodni temu
     */
    public SkiJumping(String jumperName, int lastPlace, int lastPlace2, int lastPlace3, int lastPlace4, int lastPlace5) {
        this.jumperName = jumperName;
        this.lastPlace = lastPlace;
        this.lastPlace2 = lastPlace2;
        this.lastPlace3 = lastPlace3;
        this.lastPlace4 = lastPlace4;
        this.lastPlace5 = lastPlace5;
    }

    /**
     * @param jumperName1 - nazwa pierwszej pobieranej druzyny
     * @param stars1 - ilosc gwiazdek pierwszej pobieranej druzyny
     * @param jumperName2 - nazwa drugiej pobieranej druzyny
     * @param stars2 - ilosc gwiazdek drugiej pobieranej druzyny
     */
    public static void skiJumpingResult(String jumperName1, double stars1, String jumperName2, double stars2) {
        if(stars1>stars2)
            System.out.println("In competition between "+jumperName1+" and "+jumperName2+" higher should be "+jumperName1);
        else if (stars2>stars1)
            System.out.println("In competition between "+jumperName1+" and "+jumperName2+" higher should be "+jumperName2);
        else
            System.out.println("In competition between "+jumperName1+" and "+jumperName2+" should be won by luckily jumper :)");
    }

    /**
     * wyswietlanie statystyk odnosnie wybranego zawodnika
     */
    public void showSkiJumpingStatistics() {
        double stars = 250-this.lastPlace-this.lastPlace2-this.lastPlace3-this.lastPlace4-this.lastPlace5;
        double maxStars = 250;
        System.out.println("You chose "+this.jumperName+" whose last places were: "+lastPlace+", "+lastPlace2+", "+lastPlace3+", "+lastPlace4+", "+lastPlace5);
        System.out.println("In our rating he have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    /**
     * @return wspolczynnik gwiazdek do wybrania lepszego zawodnika
     */
    public double skiJumpingStars() {
        double stars = 250-this.lastPlace-this.lastPlace2-this.lastPlace3-this.lastPlace4-this.lastPlace5;
        double maxStars = 245;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    /**
     * @return zwraca nazwe zawodnika
     */
    public String showJumperName() {
        return this.jumperName;
    }
}
