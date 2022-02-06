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
        System.out.println("5. Handball");
        System.out.println("---------------");
        System.out.println("Choose sport:");

        Scanner scanner = new Scanner(System.in);
        sport = scanner.nextInt();

        switch(sport){
            case 1:
                Path inputPath = Paths.get("FootballTeams.txt");
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<Football> teams = new ArrayList<>();

                System.out.println("List of available teams:");

                for(int i=0;i<lines.size();i++)
                {
                    if(lines.get(i).equals("FootballTeam")){
                        String teamName = lines.get(i+1);
                        int wins = Integer.parseInt(lines.get(i+2));
                        int draws = Integer.parseInt(lines.get(i+3));
                        int losses = Integer.parseInt(lines.get(i+4));
                        int goalsScored = Integer.parseInt(lines.get(i+5));
                        int goalsLost = Integer.parseInt(lines.get(i+6));

                        Football team= new Football(teamName,wins,draws,losses,goalsScored,goalsLost);

                        teams.add(team);
                        if(i==0)
                            System.out.println(i+" - "+teamName);
                        else
                            System.out.println(i/7+" - "+teamName);
                    }
                }
                System.out.println("Choose team 1:");
                int team1;
                team1 = scanner.nextInt();
                teams.get(team1).showStatistics();
                System.out.println("Choose team 2:");
                int team2;
                team2 = scanner.nextInt();
                teams.get(team2).showStatistics();

                int stars1,stars2;
                stars1 = teams.get(team1).stars();
                stars2 = teams.get(team2).stars();

                String teamName1;
                String teamName2;
                teamName1 = teams.get(team1).showTeamName();
                teamName2 = teams.get(team2).showTeamName();

                Football.result(teamName1,stars1,teamName2,stars2);

        }
    }
}