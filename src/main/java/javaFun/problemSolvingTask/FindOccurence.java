package javaFun.problemSolvingTask;

public class FindOccurence {
        public static void main(String[] args) {
            String word = "Mississippi";
            int numberOfS = 0;
            int numberOfI = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 's') {
                    numberOfS++;
                }
                if (word.charAt(i) == 'i') {
                    numberOfI++;
                }
            }

            System.out.println("The number of occurrences of character 's' is " + numberOfS);
            System.out.println("The number of occurrences of character 'i' is " + numberOfI);
        }
    }


