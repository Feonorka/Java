import java.util.ArrayList;
import java.util.List;

public class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    private List<ГорячийНапиток> напитки;

    public ГорячихНапитковАвтомат(List<ГорячийНапиток> напитки) {
       this.напитки = new ArrayList<>(напитки);
    }

    @Override
    public String getProduct(int name, int price) {
        for (ГорячийНапиток напиток : напитки) {
            if (напиток.getName() == name && напиток.getPrice() == price) {
                return "Возьмите ваш " + напиток.getName() + " за " + напиток.getPrice() + " рублей";
            }
        }
        return "Такого напитка нет в аппарате";
    }

    @Override
    public String getProduct(int name, int volume, int temperature) {
        for (ГорячийНапиток напиток : напитки) {
            if (напиток.getName() == name && напиток.getVolume() == volume && напиток.getTemperature() == temperature) {
                return "Возьмите ваш " + напиток.getName() + " объемом " + напиток.getVolume() + " мл при температуре " + напиток.getTemperature() + " градусов" ;
            }
        }
        return "Такого напитка нет в аппарате";
    }
}
