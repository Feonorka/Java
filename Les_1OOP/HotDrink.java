package Les_1OOP;

public class HotDrink {
    // поля класса HotDrink
    protected String drinkType;
    protected boolean withSugar;
  
    // конструктор класса HotDrink
    public HotDrink(String drinkType, boolean withSugar) {
      this.drinkType = drinkType;
      this.withSugar = withSugar;
    }
  
    // методы класса HotDrink
    public void addSugar() {
      this.withSugar = true;
    }
  
    public void removeSugar() {
      this.withSugar = false;
    }
  
    public void setDrinkType(String drinkType) {
      this.drinkType = drinkType;
    }
  
    public String getDrinkType() {
      return this.drinkType;
    }
  
    public boolean isWithSugar() {
      return this.withSugar;
    }
  } 
  