package com.battletheboss;


import java.util.Scanner;

public class Riddle {
    Scanner input = new Scanner(System.in);


    public void riddleChoice() {
        System.out.println("You are almost at the boss... \n");
        System.out.println("All you have to do is answer the riddle correct ;)\n");

        System.out.println("Do you want an 'easy' or 'hard' riddle?\n");
        String choice = input.nextLine();

        if (choice.equals("easy")) {
            riddleEasy();

        }

        if (choice.equals("hard")) {
            riddleHard();

        }
    }

    public void riddleEasy() {
        System.out.println("What gets bigger the more you take away?");
        System.out.println("Enter your answer: \n");
        String easyRiddle = input.nextLine();

        if (easyRiddle.equals("a hole")) {
            System.out.println("Whoop, you are correct!");
        } else {
            System.out.println("Sorry that was incorrect, try again!");

            riddleEasy();
        }
    }

    public void riddleHard() {
        System.out.println("What word in the English dictionary is ALWAYS spelt wrong?");
        System.out.println("Enter your answer: ");
        String hardRiddle = input.nextLine();

        if(hardRiddle.equals("wrong")) {
            System.out.println("Yepp, great job!!");

        } else {
            System.out.println("Nope that´s wrong, try again ;) ");
            riddleChoice();
        }

    }
}
