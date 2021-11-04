package com.battletheboss;

import java.util.Scanner;

public class BossGuessGame {

        public static void bossGuessGame(){



            int attempt = 1;
            int userGuessNumber = 0;
            int secretNumber = (int) (Math.random() * 3 + 1);
            Scanner userInput = new Scanner(System.in);
            System.out.println("The Big Boss is hiding out in 1 of 3 rooms\nCan you guess which one?\nYou have a Maximum 5 Attempt Limit. Tic Toc!");
            do {
                System.out.print("Guess which room the boss is in: 1 to 3\n");
                if(userInput.hasNextInt()) {
                    userGuessNumber = userInput.nextInt();
                    if (userGuessNumber == secretNumber)
                    {
                        System.out.println("OOhhOO!, You found the bastard! You Won the Game!");
                        break;
                    }
                    else if (userGuessNumber != secretNumber)
                        System.out.println("He's not here");
                    if(attempt == 5) {
                        System.out.println("You have exceeded the maximum attempts. Try Again");
                        break;
                    }
                    attempt++;
                }else {
                    System.out.println("Enter a Valid Number");
                    break;
                }
            } while (userGuessNumber != secretNumber);

        }
}
