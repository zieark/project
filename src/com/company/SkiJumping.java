package com.company;

public class SkiJumping {
    private String jumperName;
    private int lastPlace;
    private int lastPlace2;
    private int lastPlace3;
    private int lastPlace4;
    private int lastPlace5;

    public SkiJumping(String jumperName, int lastPlace, int lastPlace2, int lastPlace3, int lastPlace4, int lastPlace5) {
        this.jumperName = jumperName;
        this.lastPlace = lastPlace;
        this.lastPlace2 = lastPlace2;
        this.lastPlace3 = lastPlace3;
        this.lastPlace4 = lastPlace4;
        this.lastPlace5 = lastPlace5;
    }

    public static void result(String jumperName1, double stars1, String jumperName2, double stars2) {
        if(stars1>stars2)
            System.out.println("In competition between "+jumperName1+" and "+jumperName2+" higher should be "+jumperName1);
        else if (stars2>stars1)
            System.out.println("In competition between "+jumperName1+" and "+jumperName2+" higher should be "+jumperName2);
        else
            System.out.println("In competition between "+jumperName1+" and "+jumperName2+" should be won by luckily jumper :)");
    }

    public void showStatistics() {
        int stars = 250-this.lastPlace-this.lastPlace2-this.lastPlace3-this.lastPlace4-this.lastPlace5;
        int maxStars = 250;
        System.out.println("You chose "+this.jumperName+" whose last places were: "+lastPlace+", "+lastPlace2+", "+lastPlace3+", "+lastPlace4+", "+lastPlace5);
        System.out.println("In our rating he have "+stars+"/"+maxStars+" stars");
        System.out.println(" ");
    }

    public double stars() {
        double stars = 250-this.lastPlace-this.lastPlace2-this.lastPlace3-this.lastPlace4-this.lastPlace5;
        double maxStars = 250;
        double starsFactor = stars/maxStars;
        return starsFactor;
    }

    public String showJumperName() {
        return this.jumperName;
    }
}
