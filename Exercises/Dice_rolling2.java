package Exercises;
import java.util.Random;

public class Dice_rolling2  {
    static Random randomNumbers = new Random();
    static int rolldice1(){
        int dice1 = 1+randomNumbers.nextInt(6);
        //System.out.print("You rolled : "+ dice1);
        return dice1;
    }
    static int rolldice2(){
        int dice2 = 1+randomNumbers.nextInt(6);
        //System.out.print("You rolled : "+dice2);
        return dice2;
    }
    static int sum(int dice1,int dice2){
        int sum = dice1+ dice2;
        return sum;
    }
    public static void main(String[] args) {
        int [] a = new int[36000001];
        int [] frequency = new int[37];
        for(int i=0;i<36000000;i++){
                    ++frequency[sum(rolldice1(),rolldice2())];
        }
        for(int j=2;j<frequency.length;j++){
            System.out.printf("%4d%10d\n",j,frequency[j]);
        }
    }
}
