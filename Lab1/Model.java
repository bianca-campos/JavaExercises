package Lab1;

/**
 *@author biancacampos
 */

public class Model {
    private String firstName;
    private String lastName;
    private int height; //inches
    private double weight;//pounds
    private boolean canTravel;
    private boolean smokes;
    private static String occupation = "modeling";
    private int payment;

    private static int MIN_LENGTH = 3;
    private static int MIN_HEIGHT = 24;
    private static int MIN_WEIGHT = 80;
    private static int MAX_LENGTH = 20;
    private static int MAX_HEIGHT = 84;
    private static int MAX_WEIGHT = 280;
    public static final int INCHES_PER_FOOT = 12;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;



    //constructors
    //first
    /**
     * No-arg constructor
     */
    public Model(){

    }

    //second
    /**
     * This constructor is used to set the first six parameters of application
     *
     * @param firstName - this parameter set the first name of model
     * @param lastName - this parameter set the second name of model
     * @param height - this parameter set the height of model
     * @param weight - this parameter set the weight of model
     * @param canTravel - this parameter set the disponibility for the model to travel
     * @param smokes - this parameter set if the model is a smoker
     */
    //kg long
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCanTravel(canTravel);
        this.setSmokes(smokes);
    }

    //third
    /**
     * This constructor is used to set the first four parameters of application and set the model with disponibility to travel and not smoker.
     *
     * @param firstName - this parameter set the first name of model
     * @param lastName - this parameter set the second name of model
     * @param height - this parameter set the height of model
     * @param weight - this parameter set the weight of model
     */
    //pounds double
    public Model(String firstName, String lastName, int height, double weight){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCanTravel(true);
        this.setSmokes(false);
    }

    //getter
    /**
     * Getters
     *
     * @return the first name of model
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     *
     * @return the last name of model
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     *
     * @return the height of model
     */

    public int getHeight() {
        return this.height;
    }

    /**
     *
     * @return the weight of model
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     *
     * @return the disponibility of model for travel
     */
    public boolean getCanTravel(){
        return this.canTravel;
    }

    /**
     *
     * @return if the model is smoker
     */
    public boolean getSmokes() {
        return this.smokes;
    }

    /**
     *
     * @return the occupation
     */
    public static String getOccupation() {
        return occupation;
    }


    //setter
    /**
     * Setters
     *
     * @param firstName - set the first name of model
     */
    public final void setFirstName(String firstName) {
        if((firstName != null) && (firstName.length() >= MIN_LENGTH) && (firstName.length() <= MAX_LENGTH)) {
            this.firstName = firstName;
        }
    }

    /**
     *
     * @param lastName - set the second name of model
     */
    public final void setLastName(String lastName){
        if ((lastName != null) && (lastName.length() >= MIN_LENGTH) && (lastName.length() <= MAX_LENGTH)) {
            this.lastName = lastName;
        }
    }

    /**
     *
     * @param height - set the height of model
     */
    public final void setHeight(int height){
        if ((height >= MIN_HEIGHT) && (height <= MAX_HEIGHT)) {
            this.height = height;
        }
    }

    /**
     *
     * @param weight - set the weight of model
     */
    public final void setWeight(double weight){
        if ((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT)) {
            this.weight = weight;
        }
    }

    /**
     *
     * @param canTravel - set the disponibility for the model to travel
     */
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     *
     * @param smokes - set if the model is a smoker
     */
    public final void setSmokes(boolean smokes){
        this.smokes = smokes;
    }


    //methods
    /**
     * This method print first and last name of model, height in inches, weight in pounds, and if the model travel and smokes
     */
    public void printDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds"); if(canTravel == true){
            System.out.println("Does travel ");
        } else{
            System.out.println("Does not travel ");
        }
        if(smokes == true){
            System.out.println("Does smoke ");
        }else{
            System.out.println("Does not smoke ");
        }
    }

    /**
     * This method calculate the payment of model based in height, weight, if travel and smoke.
     * @return - returns the payment per hour of each model
     */
    public int calculatePayDollarsPerHour(){
        payment = BASE_RATE_DOLLARS_PER_HOUR;
        if (height >= TALL_INCHES && weight <= THIN_POUNDS) {
            payment = payment + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (canTravel) {
            payment = payment + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (smokes) {
            payment = payment - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return payment;
    }

    /**
     * Method to convert inches height in feet height
     * @return - returns height in feet
     */
    public int convertHeightToFeetInches(){
        return height / 12;
    }

    /**
     * This method print first and last name of model, height in feet and inches, weight in pounds, and if de model travel and smoke and the value of payment per hour
     */
    public void displayModelDetails(){
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Height: " + this.convertHeightToFeetInches() + " feet " + this.getHeight() + " inches");
        System.out.println("Weight: " + Math.round(this.getWeight()) + " pounds");
        if(canTravel == true){
            System.out.println("Travels: yep");
        } else{
            System.out.println("Travels: nope");
        }
        if(smokes == true){
            System.out.println("Smokes: yep");
        }else{
            System.out.println("Smokes: nope");
        }
        System.out.println("Hourly rate: $" + this.calculatePayDollarsPerHour());
    }

    /**
     * Method to convert inches to cm
     *
     * @return - returns height in cm
     */
    public double convertHeightToCm(){
        return height * 2.54;
    }

    /**
     * Method to convert pounds to kilograms
     * @return - returns weight in kg
     */
    public double convertWeightToKg(){
        return weight * 0.45359237;
    }

    /**
     *
     * @param metricUnits
     */
    //overload
    public void displayModelDetails(boolean metricUnits){
        if (metricUnits){
            System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
            System.out.println("Height: " + Math.round(this.convertHeightToCm()) + " cm ");
            System.out.println("Weight: " + Math.round(this.convertWeightToKg()) + " kg");
            if(canTravel == true){
                System.out.println("Travels: yep");
            } else{
                System.out.println("Travels: nope");
            }
            if(smokes == true){
                System.out.println("Smokes: yep");
            }else{
                System.out.println("Smokes: nope");
            }
            System.out.println("Hourly rate: $" + this.calculatePayDollarsPerHour());
        }
        }

}
