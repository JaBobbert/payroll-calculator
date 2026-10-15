package com.pluralsight;

import java.util.Scanner;

public class payroll_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name =  scan.nextLine();
        System.out.println("How many hours do you work?");
        float hours = scan.nextFloat();
        System.out.println("What is your pay rate?");
        float pay = scan.nextFloat();

        System.out.println("Hello " + name + ". You work " + hours + " hours and get paid $" + pay + " dollars per hour.");
        //
    }
}
