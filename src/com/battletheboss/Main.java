package com.battletheboss;

import static com.battletheboss.Rpsgame.*;
import static com.battletheboss.Questions.*;

public class Main {
    public static void main(String[] args) {

        //welcoming to the game, should problably be a class instead.
        System.out.println("Welcome to Battle The Boss game!");
        System.out.println("To complete this game you must go thru all the levels and gather points");
        System.out.println("You are now entering the Trolls forrest and must beat them in Rock, paper scissors game");

        //calling the rock, papaer, scissors game from class Question
        Rpsgame gameStart = new Rpsgame();
        gameStart.rpsGame();

        //if you dont win, you must play again  FIXA DENNA!
        while (playAgain())
        {
           rpsGame();
        }
        System.out.println();
        System.out.println("Well done, you beat the trolls");
        System.out.println("\nTo complete next level you must answer 3 questions");


        //level 2, calling question game
        Questions seeQuestions = new Questions();
            seeQuestions.question();

        System.out.println("Whoop whoop, you are a smart sucker :) ");
        System.out.println("\nLets see how much riddle brain you have");

        //calling the riddle game to start
        Riddle answerTheRiddle = new Riddle();
        answerTheRiddle.riddleChoice();

        System.out.println("| -----------------|");
        System.out.println("|                  |");
        System.out.println("|  Now the boss    |");
        System.out.println("|                  |");
        System.out.println("|------------------|\n");

        BossGuessGame startBossGame = new BossGuessGame();
        startBossGame.bossGuessGame();

        /*System.out.println("Now the boss");
        Boss theBoss = new Boss();
        theBoss.bossGame();*/

    }



}
