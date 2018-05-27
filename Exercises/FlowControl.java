package Exercises;

//import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * @author biancacampos
 */
public class FlowControl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1
        String num = scan.nextLine();
        String result1 = posNeg(Integer.valueOf(num));
        System.out.println(result1);

        // 2
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        String num3 = scan.nextLine();
        String result2 = greatest(Integer.valueOf(num1), Integer.valueOf(num2), Integer.valueOf(num3));
        System.out.println(result2);

        //3
        String value = scan.nextLine();
        String result3 = numbers(Float.valueOf(value));
        System.out.println(result3);

        //4
        String numDay = scan.nextLine();
        String result4 = week(Integer.valueOf(numDay));
        System.out.println(result4);

        //5
        String imp1 = scan.nextLine();
        String imp2 = scan.nextLine();
        String result5 = floatingPoint(Float.valueOf(imp1), Float.valueOf(imp2));
        System.out.println(result5);

        //6
        String month = scan.nextLine();
        String year = scan.nextLine();
        String result6 = daysInMonth(Integer.valueOf(month), Integer.valueOf(year));
        System.out.println(result6);

        //7
        String letter = scan.nextLine();
        String result7 = alphabet(String.valueOf(letter));
        System.out.println(result7);

        //8
        String year2 = scan.nextLine();
        String result8 = leap(Integer.valueOf(year2));
        System.out.println(result8);

        //9
         natural();

        //10
        String number = scan.nextLine();
        calcNumbers(Integer.valueOf(number));

        //11
        String nu1 = scan.nextLine();
        String nu2 = scan.nextLine();
        String nu3 = scan.nextLine();
        String num4 = scan.nextLine();
        String num5 = scan.nextLine();
        String result11 = sumAverage(Integer.valueOf(nu1), Integer.valueOf(nu2), Integer.valueOf(nu3),
                Integer.valueOf(num4), Integer.valueOf(num5));
        System.out.println(result11);

        //12
        String num6 = scan.nextLine();
        cube(Integer.valueOf(num6));

        //13
        String num7 = scan.nextLine();
        multiplication(Integer.valueOf(num7));

        //14
        String data = scan.nextLine();
        odd(Integer.valueOf(data));

        //15
        String num8 = scan.nextLine();
        rightAngleNum(Integer.valueOf(num8));


        //16
        String number1 = scan.nextLine();
        rightAngle(Integer.valueOf(number1));

        //17
        String row = scan.nextLine();
        increase(Integer.valueOf(row));

        //18
        String r = scan.nextLine();
        pyramid(Integer.valueOf(r));


        //19



        //20
        String imp = scan.nextLine();
        diamond(Integer.valueOf(imp));

        //21
        String imp8 = scan.nextLine();
        pascalTriangle(Integer.valueOf(imp8));


        //22
        String imp6 = scan.nextLine();
        triangleStar(Integer.valueOf(imp6));


        //23
        String imp3 = scan.nextLine();
        at(Integer.valueOf(imp3));


       //24
        String imp4 = scan.nextLine();
        numRhombus(Integer.valueOf(imp4));


        //25
        String imp5 = scan.nextLine();
        charRhombus(Integer.valueOf(imp5));


        //26
        String imp7 = scan.nextLine();
        String result26 = digits(Integer.valueOf(imp7));
        System.out.println(result26);

        //27
        String n1 = scan.nextLine();
        String n2 = scan.nextLine();
        String n3 = scan.nextLine();
        String result27 = equalNumbers(Integer.valueOf(n1), Integer.valueOf(n2), Integer.valueOf(n3));
        System.out.println(result27);

        //28
        String d1 = scan.nextLine();
        String d2 = scan.nextLine();
        String d3 = scan.nextLine();
        String result28 = order(Integer.valueOf(d1), Integer.valueOf(d2), Integer.valueOf(d3));
        System.out.println(result28);
    }

    /**
     * 1
     *
     * @param number - 35
     * @return
     */
    public static String posNeg(int number){
        if (number < 0){
            return "Number is Negative";
        } else{
            return "Number is Positive";
        }
    }

    /**
     * 2
     *
     * @param input1 - 25
     * @param input2 - 78
     * @param input3 - 87
     * @return
     */
    public static String greatest(int input1, int input2, int input3){
        int max = Math.max(input1, input2);
        int max2 = Math.max(max, input3);
        return "The greatest: " + max2;
    }

    /**
     * 3
     *
     * @param inputnum - 25
     * @return
     */
    public static String numbers(float inputnum){
        if (inputnum > 0){
            if (inputnum < 1){
                return "Positive small number";
            } else if (inputnum > 1000000){
                return "Positive large number";
            } else {
                return "Positive number";
            }
        }
        if (inputnum < 0){
            if (Math.abs(inputnum) < 1) {
                return "Negative small number";
            } else if (Math.abs(inputnum) > 1000000) {
                return "Negative large number";
            } else {
                return "Negative number";
            }
        }
        else
        {
            return "Zero";
        }
    }

    /**
     * 4
     *
     * @param day - 1 to 7
     * @return
     */
    public static String week(int day){
        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Input a number between 1 and 7";
        }
    }

    /**
     * 5
     * @param num1 - 12.47832642
     * @param num2 - 12.47832099
     * @return
     */

    public static String floatingPoint(double num1, double num2){
        num1 = Math.round(num1 * 1000);
        num1 = num1 /1000;
        num2 = Math.round(num2 * 1000);
        num2 = num2 /1000;
        if (num1 == num2){
            return "They are the same up to three decimal places";
        } else
            return  "They are different decimal places";
    }

    /**
     * 6
     *
     * @param month - 2
     * @param year - 2016
     * @return
     */
    public static String daysInMonth(int month, int year){
        String nameMonth;
        int daysMonth;
        switch (month){
            case 1:
                nameMonth = "January";
                daysMonth = 31;
                break;
            case 2:
                nameMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysMonth = 29;
                } else {
                    daysMonth = 28;
                }
                break;
            case 3:
                nameMonth = "March";
                daysMonth = 31;
                break;
            case 4:
                nameMonth = "April";
                daysMonth = 30;
                break;
            case 5:
                nameMonth = "May";
                daysMonth = 31;
                break;
            case 6:
                nameMonth = "June";
                daysMonth = 30;
                break;
            case 7:
                nameMonth = "July";
                daysMonth = 31;
                break;
            case 8:
                nameMonth = "August";
                daysMonth = 31;
                break;
            case 9:
                nameMonth = "September";
                daysMonth = 30;
                break;
            case 10:
                nameMonth = "October";
                daysMonth = 31;
                break;
            case 11:
                nameMonth = "November";
                daysMonth = 30;
                break;
            case 12:
                nameMonth = "December";
                daysMonth = 31;
                break;
            default:
                return "Input a valid month between 1 and 12";

        }
        return nameMonth + " " + year + " has " + daysMonth + " days";
    }

    /**
     * 7
     *
     * @param letter - p
     * @return
     */
    public static String alphabet(String letter){
        String LETTER = letter.toUpperCase();
        if (LETTER.equals("A") || LETTER.equals("E") || LETTER.equals("I") || LETTER.equals("O") || LETTER.equals("U")) {
            return letter + ": Input letter is Consonant";
        } else if ((LETTER.charAt(0)) >= 65 && LETTER.charAt(0) <= 90){
            return letter + ": Input letter is not Consonant";
        } else
            return letter + ": Error. It's not a letter";
    }

    /**
     * 8
     *
     * @param year - 2016
     * @return
     */
    public static String leap(int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return year + " is a leap year";
        } else {
            return year + " isn't a leap year";
        }
    }

    /**
     *  9
     *
     * @return
     */
    public static void natural(){
        String result = "";
        System.out.println("The first 10 natural numbers are:");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    /**
     *  10
     * @param num - 2
     * @return
     */
    public static void calcNumbers(int num){
        int sum = 0;
        System.out.println("The first " + num + " natural numbers are: ");
        for (int i = 1; i <= num; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number up to " + num + " terms: " + sum);
    }

    /**
     *  11
     * @param num1 - 1
     * @param num2 - 2
     * @param num3 - 3
     * @param num4 - 4
     * @param num5 - 5
     * @return
     */
    public static String sumAverage(int num1, int num2, int num3, int num4, int num5){
        int sum = num1 + num2 + num3 + num4 + num5;
        float av = sum / 5;
        return "The sum of 5 is: " + sum + "\n" + "The Average is: " + av;
    }

    /**
     *  12
     * @param num - 4
     * @return
     */
    public static void cube(int num){
        for (int i = 1; i <= num; i++){
            double result = Math.pow(i, 3);
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + result);
        }
    }

    /**
     *  13
     * @param num - 5
     * @return
     */
    public static void multiplication(int num){
        for (int i = 0; i <= num; i++){
            int result = num * i;
            System.out.println("num X " + i + " = " + result);
        }
    }

    /**
     *  14
     *
     * @param num - 5
     * @return
     */
    public static void odd(int num){
        int sum = 0;
        int count = 1;
        int numOdd = 0;
        System.out.println("The odd numbers are: ");
        while (numOdd < num){
                if (count % 2 != 0){
                    System.out.println(count);
                    sum += count;
                    numOdd++;
                }
                count++;
            }
            System.out.println("The Sum of odd Natural Number up to " + num + " terms is: " + sum);
        }

    /**
     *  15
     * @param row - 10
     */
    public static void rightAngleNum(int row){
        for(int i = 1;i <= row; i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    /**
     * 16
     *
     * @param input - 4
     * @return
     */
    public static void rightAngle( int input){
        int num = 1;
        for(int line = 1; line <= input; line++) {
            for(int content = 0; content < line; content++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
    }

    /**
     *  17
     * @param rows - 4
     * @return
     */
    public static void increase(int rows){
            int num = 1;
            for(int row = 1; row <= rows; row++) {
                for(int col = 0; col < row; col++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
    }

    /**
     *  18
     * @param input - 4
     * @return
     */
    public static void pyramid(int input){
            int num = 1;
            for(int line = 1; line <= input; line++) {
                // spaces
                for(int space = 0; space < (input - line); space++){
                    System.out.print(" ");
                }
                // content
                for(int content = 0; content < line; content++) {
                    System.out.print(num + " ");
                }
                System.out.println();
                num++;
            }
    }

    //19
    public static void floydTriangle(int row){

    }

    /**
     *  20
     *
     * @param row - 7
     * @return
     */
    public static void diamond(int row){
        String result = "";
        for(int line = 1; line <= row; line++) {
            // spaces
            for(int space = 0; space < (row - line); space++) {
                System.out.print(" ");
            }
            // stars
            int stars = 2 * line - 1;
            for(int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int line = row - 1; line >= 0; line--) {
            // spaces
            for(int space = 0; space < (row - line); space++) {
                System.out.print(" ");
            }
            // stars
            int stars = 2 * line - 1;
            for(int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(result);
    }

    /**
     *  21
     *
     * @param row - 5
     * @return
     */
    public static void pascalTriangle(int row){
        int col = 1;
        for (int i = 0; i < row; i++) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    col = 1;
                } else {
                    col = col * (i - j + 1) / j;
                }
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    /**
     *  22
     *
     * @param num - 6
     * @return
     */
    public static void triangleStar(int num){
        for(int line = num; line >= 0; line--) {
            // space (input - line)
            for(int sp = 0; sp <(num-line); sp++) {
                System.out.print(" ");
            }
            for(int at = 0; at < line; at++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *  23
     * @param input - 6
     * @return
     */
    public static void at(int input){
        for(int line = 1; line <= input; line++) {
            // space (input - line)
            for(int sp = 0; sp <(input-line); sp++) {
                System.out.print(" ");
            }
            for(int at = 0; at < line; at++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    /**
     *  24
     * @param num - 7
     * @return
     */
    public static void numRhombus(int num){
        for(int line = 1; line <= num; line++) {
            // space
            int spaces = num - line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            // num backwards
            for(int nums = num - spaces; nums > 0; nums--) {
                System.out.print(nums);
            }
            // num forwards
            for(int nums = 2; nums <= num - spaces; nums++) {
                System.out.print(nums);
            }
            System.out.println();
        }

        for(int line = num-1; line >= 0; line--) {
            // space
            int spaces = num - line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            // num backwards
            for(int nums = num - spaces; nums > 0; nums--) {
                System.out.print(nums);
            }
            // num forwards
            for(int nums = 2; nums <= num - spaces; nums++) {
                System.out.print(nums);
            }
            System.out.println();
        }
    }

    /**
     *  25
     * @param num - 7
     */
    public static void charRhombus(int num){
        char a = 65;
        for(int line = 1; line <= num; line++) {
            int spaces = num-line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for(char ch = a; ch < a + (num-spaces); ch++) {
                System.out.print(ch);
            }

            for(int ch = a + (num-spaces) - 1; ch > a; ch--) {
                System.out.print(((char)(ch - 1)));
            }
            System.out.println();
        }

        for(int line = num - 1; line > 0; line--) {
            int spaces = num-line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for(char ch = a; ch < a + (num-spaces); ch++) {
                System.out.print(ch);
            }

            for(int ch = a + (num-spaces) - 1; ch > a; ch--) {
                System.out.print(((char)(ch - 1)));
            }
            System.out.println();
        }
    }

    /**
     * 26
     *
     * @param input - 125463
     * @return
     */
    public static String digits(long input){
        int count = 0;
        while (input > 0) {
            count += 1;
            input = (input / 10);
        }
        return "Number of digits in the number: " + count;
    }

    /**
     * 27
     *
     * @param num1 - 2564
     * @param num2 - 3526
     * @param num3 - 2456
     * @return
     */
    public static String equalNumbers(int num1, int num2, int num3){
        if (num1 == num2 && num2 == num3){
            return "All numbers are equal";
        } else if (num1 != num2 && num2 != num3){
            return "All numbers are different";
        } else
            return "Neither all are equal or different";
    }

    /**
     * 28
     *
     * @param num1 - 1524
     * @param num2 - 2345
     * @param num3 - 3321
     * @return
     */
    public static String order(int num1, int num2, int num3){
        if (num1 < num2 && num2 < num3 && num1 < num3){
            return "Increasing order";
        } else if (num1 > num2 && num2 > num3 && num1 > num3){
            return "Decreasing order";
        } else
            return "Neither increasing or decreasing order";
    }

}
