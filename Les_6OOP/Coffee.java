package Les_6OOP;

// Реализация класса Coffee, наследника класса HotBeverage в соответствии с принципом ООП:

public class Coffee extends HotBeverage {
    public Coffee(String name, int volume, int temperature) {
        super(name, volume, temperature);
    }

    @Override
    public void drink() {
        System.out.println("Drinking coffee...");
    }
}
