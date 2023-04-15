package javaFun.problemSolvingTask;

import java.util.Scanner;

public class BirthdayGuess {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number = 3;

            while (true) {
                System.out.println("Guess my day of birthday");
                int guess = input.nextInt();
                if (guess != number) {
                    System.out.println("Incorrect guess");
                } else {
                    System.out.println("Correct guess");
                    break;
                }
            }
//            input.close();
        }
    }


