package com.battletheboss;

import java.util.Random;
import java.util.Scanner;

//making a class to store the kod
public class Rpsgame {

   //making choices visual but fixed
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";


    public static void rpsGame() {

        System.out.println("Enter any one of the following inputs:  ");
        System.out.println("ROCK \nPAPER \nSISSORS");
        //System.out.println();

        //returning player/troll move
        String playerMove = getPlayerMove();
        String trollMove = getTrollMove();

        //Checking who won
        if (playerMove.equals(trollMove))
            System.out.println("Its a tie, try again!");

        else if ((playerMove.equals(ROCK) && trollMove.equals(SCISSORS)) || (playerMove.equals(SCISSORS) && trollMove.equals(PAPER)) || (playerMove == PAPER && trollMove == ROCK))
            System.out.println("You win! You can now move forward");

        else if (playerMove.equals(PAPER))
            System.out.println(trollMove.equals(SCISSORS) ? "The troll Wins" : "You win");

        else
            System.out.println("The troll won, please try again");
    }
        //creating a way to enter player move and returning it
    public static String getPlayerMove() {

        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playerMove = input.toUpperCase();
        System.out.println("Player move is: " + playerMove);
        return playerMove;

    }
        //calling a random troll move
        public static String getTrollMove() {

            String trollMove;
            Random random = new Random();
            int input = random.nextInt(3) + 1;

            if (input == 1)
                trollMove = Rpsgame.ROCK;
            else if (input == 2)
                trollMove = Rpsgame.PAPER;
            else
                trollMove = Rpsgame.SCISSORS;

            System.out.println("Troll move is: " + trollMove);
            System.out.println();
            return trollMove;
        }
        //to play again, connected to while in main
    public static boolean playAgain() {
        System.out.println("Play Rock, paper, scisoors again?(y/n)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.toLowerCase().equals("y")) {
            return true;
        } else if (input.toLowerCase().equals("n")) {
            return false;
        } else {
            System.out.println("Invalid Input");
            return playAgain();
        }
    }
}
