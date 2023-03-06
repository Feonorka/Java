//Поля класса Ноутбук:
//- модель
//- производитель
//- цена
//- размер экрана
//- объем оперативной памяти
//- объем жесткого диска
//- операционная система
//- цвет

//Методы класса Ноутбук:
//- геттеры и сеттеры для всех полей
//- конструктор с параметрами для всех полей
//- метод toString() для вывода информации о ноутбуке в строковом виде

//Пример реализации класса Ноутбук в Java:

public class Notebook {
    private String model;
    private String manufacturer;
    private int price;
    private double screenSize;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(String model, String manufacturer, int price, double screenSize, int ram, int hdd, String os, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.screenSize = screenSize;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

//Для создания множества ноутбуков можно использовать ArrayList:

List<Notebook> notebooks = new ArrayList<>();
notebooks.add(new Notebook("Acer Aspire 5", "Acer", 500, 15.6, 8, 512, "Windows 10", "черный"));
notebooks.add(new Notebook("Lenovo IdeaPad 330S", "Lenovo", 600, 14.0, 8, 256, "Windows 10", "серый"));
notebooks.add(new Notebook("Dell Inspiron 15", "Dell", 700, 15.6, 16, 512, "Windows 10", "белый"));

//Для фильтрации ноутбуков по критериям можно использовать методы stream() и filter():

public static void filterNotebooks(List<Notebook> notebooks, Map<String, Object> filters) {
    notebooks.stream()
        .filter(notebook -> filterByCriteria(notebook, filters))
        .forEach(System.out::println);
}

private static boolean filterByCriteria(Notebook notebook, Map<String, Object> filters) {
    for (Map.Entry<String, Object> entry : filters.entrySet()) {
        switch (entry.getKey()) {
            case "ram":
                if (notebook.getRam() < (int)entry.getValue()) {
                    return false;
                }
                break;
            case "hdd":
                if (notebook.getHdd() < (int)entry.getValue()) {
                    return false;
                }
                break;
            case "os":
                if (!notebook.getOs().equals(entry.getValue())) {
                    return false;
                }
                break;
            case "color":
                if (!notebook.getColor().equals(entry.getValue())) {
                    return false;