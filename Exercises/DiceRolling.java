package Exercises;

//Write an application to simulate the rolling of two dice. The application should use an object of class Random
//once to roll the first die and again to roll the second die. The sum of the two values should then be calculated.
//Each die can show an integer value from 1 to 6, so the sum of the values will vary from 2 to 12, with 7 being the most frequent sum,
//and 2 and 12 the least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application should roll
//the dice 36,000,000 times. Use a one-dimensional array to tally the number of times each possible sum appears.
//Display the results in tabular format.

public class DiceRolling {
    private int faceValue;
    private final int MAX = 6;

    //constructor
    public DiceRolling() {
        this.faceValue = 1;
    }

    //getter
    public int getFaceValue() {
        return this.faceValue;
    }

    //other methods - behavior
    //roll
    public void roll(){
        int rand = (int)(Math.random() * MAX) + 1;
        this.faceValue = rand;
    }


    @Override
    public String toString(){
        return "Die: " + this.faceValue;
    }

}

