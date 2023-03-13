package Les_6OOP;

// Реализация класса Tea, наследника класса HotBeverage в соответствии с принципом ООП:
public class Tea extends HotBeverage {
    public Tea(String name, int volume, int temperature) {
        super(name, volume, temperature);
    }

    @Override
    public void drink() {
        System.out.println("Drinking tea...");
    }
}
