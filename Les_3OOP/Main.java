import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ГорячийНапиток> напитки = new ArrayList<>();
        напитки.add(new ГорячийНапиток(1, 50, 200, 70));
        напитки.add(new ГорячийНапиток(2, 100, 300, 80));
        ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат(напитки);
        System.out.println(автомат.getProduct(1, 50));
        System.out.println(автомат.getProduct(2, 300, 80));

        Iterator<ГорячийНапиток> iterator = напитки.iterator();
        while(iterator.hasNext()) {
            ГорячийНапиток напиток = iterator.next();
            if (напиток.getName() == 1) {
                iterator.remove();
            }
        }

        for (ГорячийНапиток напиток : напитки) {
            System.out.println(автомат.getProduct(напиток.getName(), напиток.getVolume(), напиток.getTemperature()));
        }
    }
}

//При запуске этой программы поочередно выводится информация о получении напитков по различным критериям,
//а затем удаляем напиток с именем 1 и использовали итератор для перебора оставшихся напитков и получения информации о них.