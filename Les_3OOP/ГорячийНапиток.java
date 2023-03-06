public class ГорячийНапиток {
    private int name;
    private int price;
    private int volume;
    private int temperature;

    public ГорячийНапиток(int name, int price, int volume, int temperature) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }
}