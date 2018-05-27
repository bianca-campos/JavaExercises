package Exercises;


public class Driver_DiceRolling {
    public static void main(String[] args) {
        DiceRolling dice1 = new DiceRolling();
        DiceRolling dice2 = new DiceRolling();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        final long ROLLS = 36000000;
        int[] arrCount = new int [14];

        //roll
        for (int i = 0; i < ROLLS; i++) {
            dice1.roll();
            sum1 = dice1.getFaceValue();
            dice2.roll();
            sum2 = dice2.getFaceValue();
            sum = sum1 + sum2;
            ++arrCount[sum];
        }

        //print
        for (int i = 2; i < arrCount.length -1; i++){
            System.out.printf("%4d%10d\n",i,arrCount[i]);
        }



    }
}


