package javaFun.problemSolvingTask;

public class PrintTwoWord {
    public static void main(String[] args) {
            String word = "VENTURES";
            for (int i = 0; i < word.length(); i += 2) {
                System.out.println(word.substring(i, Math.min(i + 2, word.length())));
            }
        }
    }


