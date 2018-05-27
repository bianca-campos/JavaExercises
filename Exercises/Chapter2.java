package Exercises;

public class Chapter2 {
    private static int number;
   // int number;
    private static int square;
    private static int cube;

    public static void main(String[] args) {
        System.out.printf("%-7s %-7s %-7s%n", "number", "square", "cube");
        for (int i = 0; i <= 10; i++){
            System.out.printf("%-7s %-7s %-7s%n", i, i * i, i * i * i);
        }
    }
}
