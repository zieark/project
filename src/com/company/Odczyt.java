package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt {
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


    }
}