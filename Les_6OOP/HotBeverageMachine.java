package Les_6OOP;

// Реализация класса ГорячихНапитковАвтомат, реализующий интерфейс ТорговыйАвтомат в соответствии с принципом ООП:

import java.util.ArrayList;
import java.util.List;

public class HotBeverageMachine implements VendingMachine<HotBeverage> {
    private List<HotBeverage> beverages;

    public HotBeverageMachine() {
        beverages = new ArrayList<>();
        beverages.add(new Coffee("Cappuccino", 200, 70));
        beverages.add(new Tea("Green tea", 300, 80));
        beverages.add(new Coffee("Americano", 400, 90));
    }

    @Override
    public HotBeverage getProduct(String name, int volume) throws NoSuchProductException {
        for (HotBeverage beverage : beverages) {
            if (beverage.getName().equals(name) && beverage.getVolume() == volume) {
                return beverage;
            }
        }
        throw new NoSuchProductException("No such product found in the vending machine!");
    }

    public HotBeverage getProduct(String name, int volume, int temperature) throws NoSuchProductException {
        for (HotBeverage beverage : beverages) {
            if (beverage.getName().equals(name) && beverage.getVolume() == volume && beverage.getTemperature() == temperature) {
                return beverage;
            }
        }
        throw new NoSuchProductException("No such product found in the vending machine!");
    }

    @Override
    public List<HotBeverage> getProductsInfo() {
        return beverages;
    }
}
