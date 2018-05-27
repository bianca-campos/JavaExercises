package Lab2;

import java.util.Arrays;

/**
 * @author biancacampos
 */
public class Province {
    private String province;
    private String capital;
    private int populationInMillions;
    public final static int DEFAULT_POPULATION_MILLIONS = 4;
    public final static String DEFAULT_PROVINCE = "British Columbia";
    public final static String DEFAULT_CAPITAL = "Victoria";



    /**
     * The constructor Province returns the information about the province. If there is any error the constructor create a default province
     * @param province - input a string province
     * @param capital - input a string capital
     * @param populationInMillions - input an int population
     */
    public Province(String province, String capital, int populationInMillions) {
        if (isValidPopulation(populationInMillions) && isValidProvince(province) && isValidCapitalCity(capital)) {
            this.province = province;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        } else{
            this.province = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }
    }

    /**
     * This method do the validation in the population data. Must be between 4 and 38 millions.
     * @param populationInMillions - input an int population
     * @return - return a boolean
     */
    // Population validation
    public boolean isValidPopulation(int populationInMillions){
        if (populationInMillions >= 4 && populationInMillions <= 38){
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method do the validation in province input. Must be one of the 10 Canadian Provinces
     * @param province - input a string provinve
     * @return - return a boolean
     */
    // Province validation
    public boolean isValidProvince(String province){
        String arrProvince[] = {"Ontario",
                                "Quebec",
                                "Nova Scotia",
                                "New Brunswick",
                                "Manitoba",
                                "British Columbia",
                                "Prince Edward Island",
                                "Saskatchewan",
                                "Alberta",
                                "Newfoundland and Labrador"};
        int i = 0;
        while (i < arrProvince.length){
            if (province.equals(arrProvince[i])){
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * This method do the validation in capital input. Must be the correct name of the capital city
     * @param capital - input a string capital
     * @return - return a boolean
     */
    // Capital validation
    public boolean isValidCapitalCity(String capital){
        String arrCapital[] = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton","St. John's"};
        int i = 0;
        while (i < arrCapital.length){
            if (capital.equals(arrCapital[i])){
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * Get the information about population
     * @return - population in millions
     */
    public int getPopulationInMillions() {
        return populationInMillions;
    }


    /**
     *
     * @return - return the informationsacout province, population and capital.
     */
    public String getDetails() {
        return "The capital of " + this.province + " (pop. " + this.populationInMillions + " millions) is " + this.capital;
    }
}
