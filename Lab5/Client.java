package Lab5;

public class Client {
    public static void main(String[] args) {
        Horse h1 = new BlackHorse("David", 150, "Canada");
        Horse h2 = new WhiteHorse("Trigger", 1340, "Brazil");
        Horse h3 = new BlackHorse("Lady", 1575, "Canada");
        HorseBarn vanBarn = new HorseBarn(5);
        vanBarn.addHorse(0, h1);
        vanBarn.addHorse(2, h2);
        vanBarn.addHorse(4, h3);

    }
}
