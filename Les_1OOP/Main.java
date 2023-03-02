package Les_1OOP;

// Интерфейс ТорговыйАвтомат
interface ТорговыйАвтомат {
   void addProduct(Product product);
   Product getProduct(String name);
}

// Класс продукта
class Product {
   private String name;
   private int volume;
   private int temperature;

   public Product(String name, int volume, int temperature) {
       this.name = name;
       this.volume = volume;
       this.temperature = temperature;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getVolume() {
       return volume;
   }

   public void setVolume(int volume) {
       this.volume = volume;
   }

   public int getTemperature() {
       return temperature;
   }

   public void setTemperature(int temperature) {
       this.temperature = temperature;
   }
}

// Готовый класс Горячих напитков
class HotDrink extends Product {
   public HotDrink(String name, int volume, int temperature) {
       super(name, volume, temperature);
   }

   @Override
   public String toString() {
       return getName() + " " + getVolume() + "ml " + getTemperature() + "C";
   }
}

// Готовый класс Кофе
class Coffee extends Product {
   public Coffee(String name, int volume, int temperature) {
       super(name, volume, temperature);
   }
}

// Класс ГорячихНапитковАвтомат реализует интерфейс ТорговыйАвтомат
class HotDrinkMachine implements ТорговыйАвтомат {
   private List<Product> productsList = new ArrayList<>();

   @Override
   public void addProduct(Product product) {
       productsList.add(product);
   }

   @Override
   public Product getProduct(String name) {
       for (Product product : productsList) {
           if (product.getName().equals(name)) {
               return product;
           }
       }
       return null;
   }

   public Product getProduct(String name, int volume, int temperature) {
       for (Product product : productsList) {
           if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
               return product;
           }
       }
       return null;
   }
}

public class Main {
   public static void main(String[] args) {
       // Создаем объект автомата
       ТорговыйАвтомат hotDrinkMachine = new HotDrinkMachine();

       // Добавляем несколько наименований продуктов в автомат
       hotDrinkMachine.addProduct(new HotDrink("Чай", 250, 75));
       hotDrinkMachine.addProduct(new HotDrink("Кофе", 200, 90));
       hotDrinkMachine.addProduct(new HotDrink("Горячий шоколад", 300, 85));

       // Получаем продукты по наименованию
       System.out.println(hotDrinkMachine.getProduct("Чай"));
       System.out.println(hotDrinkMachine.getProduct("Кофе"));
       System.out.println(hotDrinkMachine.getProduct("Горячий шоколад"));

       // Получаем продукт по наименованию, объему и температуре
       System.out.println(hotDrinkMachine.getProduct("Чай", 250, 75));
       System.out.println(hotDrinkMachine.getProduct("Кофе", 300, 85));
       System.out.println(hotDrinkMachine.getProduct("Горячий шоколад", 200, 90));
   }
}