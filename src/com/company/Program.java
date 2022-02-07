package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        int sport;
        System.out.println("Sports:");
        System.out.println("1. Football");
        System.out.println("2. Basketball");
        System.out.println("3. Volleyball");
        System.out.println("4. Tennis");
        System.out.println("5. Ski jumping");
        System.out.println("---------------");
        System.out.println("Choose sport:");

        Scanner scanner = new Scanner(System.in);
        sport = scanner.nextInt();

        switch(sport){
            case 1: {
                Path inputPath = Paths.get("FootballTeams.txt");
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<Football> teams = new ArrayList<>();

                System.out.println("List of available teams:");

                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).equals("FootballTeam")) {
                        String teamName = lines.get(i + 1);
                        int wins = Integer.parseInt(lines.get(i + 2));
                        int draws = Integer.parseInt(lines.get(i + 3));
                        int losses = Integer.parseInt(lines.get(i + 4));
                        int goalsScored = Integer.parseInt(lines.get(i + 5));
                        int goalsLost = Integer.parseInt(lines.get(i + 6));

                        Football team = new Football(teamName, wins, draws, losses, goalsScored, goalsLost);

                        teams.add(team);
                        if (i == 0)
                            System.out.println(i + " - " + teamName);
                        else
                            System.out.println(i / 7 + " - " + teamName);
                    }
                }
                System.out.print("Choose team 1: ");
                int team1, team2, stars1, stars2;
                String teamName1, teamName2;
                team1 = scanner.nextInt();
                teams.get(team1).showStatistics();
                System.out.print("Choose team 2: ");
                team2 = scanner.nextInt();
                teams.get(team2).showStatistics();
                stars1 = teams.get(team1).stars();
                stars2 = teams.get(team2).stars();
                teamName1 = teams.get(team1).showTeamName();
                teamName2 = teams.get(team2).showTeamName();
                Football.result(teamName1, stars1, teamName2, stars2);
                break;
            }
            case 2:{
                Path inputPath = Paths.get("BasketballTeams.txt");
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<Basketball> teams = new ArrayList<>();

                System.out.println("List of available teams:");

                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).equals("BasketballTeam")) {
                        String teamName = lines.get(i + 1);
                        int wins = Integer.parseInt(lines.get(i + 2));
                        int losses = Integer.parseInt(lines.get(i + 3));
                        int pointsScored = Integer.parseInt(lines.get(i + 4));
                        int pointsConceded = Integer.parseInt(lines.get(i + 5));

                        Basketball team = new Basketball(teamName, wins, losses, pointsScored, pointsConceded);

                        teams.add(team);
                        if (i == 0)
                            System.out.println(i + " - " + teamName);
                        else
                            System.out.println(i / 6 + " - " + teamName);
                    }
                }
                System.out.print("Choose team 1: ");
                int team1, team2;
                double stars1, stars2;
                String teamName1, teamName2;
                team1 = scanner.nextInt();
                teams.get(team1).showStatistics();
                System.out.print("Choose team 2: ");
                team2 = scanner.nextInt();
                teams.get(team2).showStatistics();
                stars1 = teams.get(team1).stars();
                stars2 = teams.get(team2).stars();
                teamName1 = teams.get(team1).showTeamName();
                teamName2 = teams.get(team2).showTeamName();
                Basketball.result(teamName1, stars1, teamName2, stars2);
                break;
            }
            case 3:{
                Path inputPath = Paths.get("VolleyballTeams.txt");
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<Volleyball> teams = new ArrayList<>();

                System.out.println("List of available teams:");

                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).equals("VolleyballTeam")) {
                        String teamName = lines.get(i + 1);
                        int wins = Integer.parseInt(lines.get(i + 2));
                        int losses = Integer.parseInt(lines.get(i + 3));
                        int winsIn5Sets = Integer.parseInt(lines.get(i + 4));
                        int lossesIn5Sets = Integer.parseInt(lines.get(i + 5));
                        int points = Integer.parseInt(lines.get(i + 6));
                        int setsWon = Integer.parseInt(lines.get(i + 7));
                        int setsLosses = Integer.parseInt(lines.get(i + 8));

                        Volleyball team = new Volleyball(teamName, wins, losses, winsIn5Sets, lossesIn5Sets, points,setsWon,setsLosses);

                        teams.add(team);
                        if (i == 0)
                            System.out.println(i + " - " + teamName);
                        else
                            System.out.println(i / 9 + " - " + teamName);
                    }
                }
                System.out.print("Choose team 1: ");
                int team1, team2;
                double stars1, stars2;
                String teamName1, teamName2;
                team1 = scanner.nextInt();
                teams.get(team1).showStatistics();
                System.out.print("Choose team 2: ");
                team2 = scanner.nextInt();
                teams.get(team2).showStatistics();
                stars1 = teams.get(team1).stars();
                stars2 = teams.get(team2).stars();
                teamName1 = teams.get(team1).showTeamName();
                teamName2 = teams.get(team2).showTeamName();
                Volleyball.result(teamName1, stars1, teamName2, stars2);
                break;
            }
            case 4:{

            }
            case 5:{

            }
            default:{

            }
        }
    }
}