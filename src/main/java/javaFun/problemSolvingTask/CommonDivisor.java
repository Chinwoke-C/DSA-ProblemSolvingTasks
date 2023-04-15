package javaFun.problemSolvingTask;

public class CommonDivisor {

        public static void main(String[] args) {
            int num = 0;
            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0) {
                    num += i;
                }
            }
            System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + num);
        }
    }


