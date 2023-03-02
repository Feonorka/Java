package Les_1OOP;

public class HotTea extends HotDrink {
    // дополнительное поле класса HotTea
    private int temp;
  
    // конструктор класса HotTea
    public HotTea(String drinkType, boolean withSugar, int temp) {
      super(drinkType, withSugar);
      this.temp = temp;
    }
  
    // метод класса HotTea
    public void setTemp(int temp) {
      this.temp = temp;
    }
  
    public int getTemp() {
      return this.temp;
    }
  }
