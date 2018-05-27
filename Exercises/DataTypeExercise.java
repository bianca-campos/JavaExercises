package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author biancacampos
 */
public class DataTypeExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1
        String fahr = scan.nextLine();
        String result1 = fahrenheitToCelcius(Integer.valueOf(fahr));
        System.out.println(result1);

        // 2
        String inch = scan.nextLine();
        String result2 = inchesToMeters(Integer.valueOf(inch));
        System.out.println(result2);

        // 3
        String input = scan.nextLine();
        String result3 = addInteger(Integer.valueOf(input));
        System.out.println(result3);

        //4
        int min = scan.nextInt();
        String result4 = minutesToYearsAndDays(min);
        System.out.println(result4);

        //5
        int index1 = scan.nextInt();
        double index2 = scan.nextDouble();
        String result5 = bodyMassIndex(index1, index2);
        System.out.println(result5);

        //6
        int meter = scan.nextInt();
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int sec = scan.nextInt();
        String result6 = distanceTime(meter, hour, minute, sec);
        System.out.println(result6);

        //7
        int num = scan.nextInt();
        String result7 = calcSquareCubeFourth(num);
        System.out.println(result7);

        //8
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        String result8 = conversions(int1, int2);
        System.out.println(result8);
    }

    /**
     * 1 - This exercise convert fahrenheit to celsius
     *
     * @param fahrenheit - input integer for degrees in fahrenheit. Ex: 212
     * @return - formatted conversion
     */
    public static String fahrenheitToCelcius(int fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        return fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius";
    }

    /**
     * 2 - This exercise convert inches to meters
     *
     * @param inches - input integer for inches. Ex: 1000
     * @return - formatted conversion
     */
    public static String inchesToMeters(int inches){
        final double INCHE_METER = 0.0254;
        double meters = inches * INCHE_METER;
        return inches + " inch is " + meters + " meters";
    }

    /**
     * 3 - This exercise sum the digits of input
     *
     * @param digit - input integer between 0 and 1000. Ex: 565
     * @return - sum of all digits
     */
    public static String addInteger(int digit){
        int first = digit % 10;
        int remainder = digit / 10;
        int second = remainder % 10;
        remainder = remainder / 10;
        int third = remainder %10;
        remainder = remainder / 10;
        int fourth = remainder %10;
        int sum = first + second + third + fourth;
        return "The sum of all digits in " + digit + " is " + sum;
    }

    /**
     * 4 - This exercise convert minutes into years and days
     *
     * @param minutes - input integer minutes. Ex: 3456789
     * @return - minutes converted in years and days
     */
    public static String minutesToYearsAndDays(int minutes){
        final double MINUTES_YEAR = 525949.2;
        final int MINUTES_DAY= 1440;
        double years = minutes / MINUTES_YEAR;
        double years_remainder = minutes % MINUTES_YEAR;
        double days = years_remainder / MINUTES_DAY;
        return minutes + " minutes is approximately " + Math.round(years) + " years and " + Math.round(days)  + " days";
    }

    /**
     * 5 - This exercise compute the body mass index (BMI)
     *
     * @param weight - input weight in Kg. Ex: 70
     * @param height - input height in meters. Ex: 1.75
     * @return - BMI truncate with three decimals.
     */
    public static String bodyMassIndex(int weight, double height){
        double bmi = weight / (height * height);
        return "Body Mass Index is " + new DecimalFormat("#.###").format(bmi);
    }


    /**
     * 6 - This exercise convert the distance and time in meters/second, km/h and miles/h
     *
     * @param distance - input distance in meters. Ex: 2500
     * @param hours - input an integer number. Ex: 5
     * @param minutes - input an integer number. Ex: 56
     * @param seconds - input an integer number. Ex: 23
     * @return - Speed in meters/second, km/h, miles/h truncate with eight decimals.
     */
    public static String distanceTime(int distance, int hours, int minutes, int seconds){
        final double SECONDS_PER_HOUR = 3600;
        final int SECOND = 60;
        final double MINUTE_HOUR = 0.0166667;
        final double SECOND_HOUR = 0.000277778;
        final int KM = 1000;
        final int MILE = 1609;
        double hoursSeconds = hours * SECONDS_PER_HOUR;
        double minutesSeconds = minutes * SECOND;
        double meterPerSecond = distance / (hoursSeconds + minutesSeconds + seconds);
        double minutesHours = minutes * MINUTE_HOUR;
        double secondsHours = seconds * SECOND_HOUR;
        double kmPerHour = (distance / (hours + minutesHours + secondsHours)) / KM;
        double milesPerHour = (distance / (hours + minutesHours + secondsHours)) / MILE;
        return "Your speed in meters/second is " + new DecimalFormat("#.########").format(meterPerSecond) +
                "\n" + "Your speed in km/h is " + new DecimalFormat("#.########").format(kmPerHour) +
                "\n" + "Your speed in miles/h is " + new DecimalFormat("#.########").format(milesPerHour);
    }


    /**
     * 7 - This exercise convert an input in square, cube and fourth power
     *
     * @param input7 - input an integer number. Ex: 5
     * @return - the result in square, cube and fourth power
     */
    public static String calcSquareCubeFourth(int input7){
        int square = input7 * input7;
        int cube = input7 * input7 * input7;
        int fourth = input7 * input7 * input7 * input7;
        return "Square: " + square + "\n" + "Cube: " + cube + "\n" + "Fourth power: " + fourth;
    }

    /**
     * 8 - This exercise accept two integers and print the conversions
     *
     * @param input1 - input the first integer number. Ex: 25
     * @param input2 - input the second integer number. Ex: 5
     * @return - sum, difference, product, average,
     *          distance(the absolute number, applicable if the first number is less than second number),
     *          maximum and minimum of inputs
     */
    public static String conversions(int input1, int input2){
        final int INPUTS = 2;
        int sum = input1 + input2;
        int difference = input1 - input2;
        int product = input1 * input2;
        double average = (input1 + input2) / INPUTS;
        int distance = Math.abs(input1 - input2);
        int max = Math.max(input1, input2);
        int min = Math.min(input1, input2);
        return "Sum of two integers: " + sum + "\n" + "Difference of two integers: " + difference + "\n" +
                "Product of two integers: " + product + "\n" + "Average of two integers: " + average + "\n" +
                "Distance of two integers: " + distance + "\n" + "Max integer: " + max + "\n" +
                "Min integer: " + min;
    }

}
