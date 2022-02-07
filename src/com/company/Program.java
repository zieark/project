package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program glowny do przewidywania zwyciescy
 */
public class Program {
    /**
     * @param args program glowny
     */
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
                Path inputPath = Paths.get("TennisPlayers.txt");
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<Tennis> players = new ArrayList<>();

                System.out.println("List of available players:");

                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).equals("TennisPlayer")) {
                        String playerName = lines.get(i + 1);
                        int wins = Integer.parseInt(lines.get(i + 2));
                        int tournamentWon = Integer.parseInt(lines.get(i + 3));
                        int losses = Integer.parseInt(lines.get(i + 4));

                        Tennis player = new Tennis(playerName, wins, tournamentWon, losses);

                        players.add(player);
                        if (i == 0)
                            System.out.println(i + " - " + playerName);
                        else
                            System.out.println(i / 5 + " - " + playerName);
                    }
                }
                System.out.print("Choose first player: ");
                int player1, player2;
                double stars1, stars2;
                String playerName1, playerName2;
                player1 = scanner.nextInt();
                players.get(player1).showStatistics();
                System.out.print("Choose second player: ");
                player2 = scanner.nextInt();
                players.get(player2).showStatistics();
                stars1 = players.get(player1).stars();
                stars2 = players.get(player2).stars();
                playerName1 = players.get(player1).showPlayerName();
                playerName2 = players.get(player2).showPlayerName();
                Tennis.result(playerName1, stars1, playerName2, stars2);
                break;

            }
            case 5:{

                Path inputPath = Paths.get("SkiJumpers.txt");
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<SkiJumping> jumpers = new ArrayList<>();

                System.out.println("List of available jumpers:");

                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).equals("SkiJumper")) {
                        String jumperName = lines.get(i + 1);
                        int lastPlace = Integer.parseInt(lines.get(i+2));
                        int lastPlace2 = Integer.parseInt(lines.get(i+3));
                        int lastPlace3 = Integer.parseInt(lines.get(i+4));
                        int lastPlace4 = Integer.parseInt(lines.get(i+5));
                        int lastPlace5 = Integer.parseInt(lines.get(i+6));

                        SkiJumping jumper = new SkiJumping(jumperName,lastPlace,lastPlace2,lastPlace3,lastPlace4,lastPlace5);

                        jumpers.add(jumper);
                        if (i == 0)
                            System.out.println(i + " - " + jumperName);
                        else
                            System.out.println(i / 7 + " - " + jumperName);
                    }
                }
                System.out.print("Choose first jumper: ");
                int jumper1, jumper2;
                double stars1, stars2;
                String jumperName1, jumperName2;
                jumper1 = scanner.nextInt();
                jumpers.get(jumper1).showStatistics();
                System.out.print("Choose second jumper: ");
                jumper2 = scanner.nextInt();
                jumpers.get(jumper2).showStatistics();
                stars1 = jumpers.get(jumper1).stars();
                stars2 = jumpers.get(jumper2).stars();
                jumperName1 = jumpers.get(jumper1).showJumperName();
                jumperName2 = jumpers.get(jumper2).showJumperName();
                SkiJumping.result(jumperName1, stars1, jumperName2, stars2);
                break;


            }
            default:{
                System.out.println("Brak takiego sportu");
            }
        }
    }
}