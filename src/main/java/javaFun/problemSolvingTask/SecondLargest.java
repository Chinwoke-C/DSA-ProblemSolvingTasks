package javaFun.problemSolvingTask;

import java.util.Scanner;

public class SecondLargest {
        public static void main(String[] args) {
            int largest = 0;
            int secondLargest = 0;
            int sentinel = -1;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number or press -1 to quit: ");
            int userInput = scanner.nextInt();

            while (userInput != sentinel) {
                System.out.println(userInput);
                System.out.print("Enter a number or press -1 to quit: ");
                userInput = scanner.nextInt();
                if (userInput > largest) {
                    secondLargest = largest;
                    largest = userInput;
                } else if (userInput > secondLargest) {
                    secondLargest = userInput;
                }
            }

            System.out.println("The second largest number is: " + secondLargest);
        }
    }


