package Les_6OOP;

// Реализация класса ГорячийНапиток c дополнительным полем температура в соответствии с принципом ООП:
public abstract class HotBeverage {
    private String name;
    private int volume;
    private int temperature;

    public HotBeverage(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public abstract void drink();
}