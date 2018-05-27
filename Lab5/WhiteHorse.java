package Lab5;

public class WhiteHorse implements Horse{
    private String name;
    private int weight;
    private String country;

    public WhiteHorse(String name, int weight, String country) {
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
