package com.company;

import java.util.Scanner;

public class Græs {

    public int whenToMoweTheLawn(double grassLength, double maxLength){
        boolean dontCut = true;
        int amountOfDays = 0;
        while (dontCut){
            amountOfDays++;
            grassLength += 0.8;
            if (grassLength >= maxLength){
                dontCut = false;
            }
        }
        return amountOfDays;
    }


    public static void main(String[] args) {
        Græs græs = new Græs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Current height of grass: ");
        double currentHeight = sc.nextDouble();
        System.out.println("When do you think it is too high?: ");
        double maxHeight = sc.nextDouble();

        System.out.println(græs.whenToMoweTheLawn(currentHeight, maxHeight));
    }

}
