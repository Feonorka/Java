package Les_6OOP;

// Пример использования в соответствии с принципом ООП и MVC:

import java.util.List;

public class main {
    
    public static void main(String[] args) {
        // Создаем автомат с напитками
        HotBeverageMachine machine = new HotBeverageMachine();
        // Получаем информацию о напитках в автомате
        List<HotBeverage> products = machine.getProductsInfo();
        for (HotBeverage product : products) {
            System.out.println(product.getName() + " (" + product.getVolume() + " ml) [" + product.getTemperature() + "C]");
            }
        // Получаем конкретный продукт из автомата по имени, объему и температуре
            try {
                HotBeverage hotBeverage = machine.getProduct("Cappuccino", 200, 70);
                Finally
                }
            }
}