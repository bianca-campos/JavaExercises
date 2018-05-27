package Exercises;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String nospace = sentence.toLowerCase().replace(" ", "");

//        if (nospace.length() < 26) {
//            System.out.println("not pangram");
//            return;
//        }

        // Bianca
        String[] alpha = {"a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int count = 0;
        for(int i = 0; i < nospace.length(); i++){
            if (nospace.contains(alpha[i])) {
                count++;
            }
        }
        if (count == 26) {
            System.out.println("pangram");
        } else {
            System.out.println(count);
        }


    }
}

