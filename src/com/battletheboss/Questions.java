package com.battletheboss;

import java.util.Scanner;

public class Questions {
    String prompt;
    String answer;

    //stores the value of question and answer
    public Questions(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;

    }

    public Questions() {

    }
        //making question strings
    public String question(){
        String q1 = "How long does the sun\'s light take to travel to earth?\n"
                  + "(a) 7 seconds \n(b) 8 mins \n(c) 9 hours";
        String q2 = "\nWhen were there the first vikings in Scandinavia?\n"
                  + "(a) 800 A.D. \n(b) 900 B.C. \n(c) 100 B.C.";
        String q3 = "How many times did Björn Borg win the French Open?\n"
                  + "(a) 2 times \n(b) 4 times \n(c) 6 times";
        //stating question and answer
        Questions [] question = new Questions[]{
                new Questions(q1, "b"),
                new Questions(q2, "a"),
                new Questions(q3, "c")
        };
        questionTest(question);
        return q1;
    }


        //looping through the array of questions
    public static void questionTest(Questions [] question) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i < question.length; i++ ) {
            System.out.println(question[i].prompt);
            String answer = input.nextLine();
            if(answer.equals(question[i].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + question.length);
    }


}
