package Les_6OOP;

// Реализация интерфейса ТорговыйАвтомат в соответствии с принципом ООП:

import java.util.List;

public interface VendingMachine<T> {
    T getProduct(String name, int volume) throws NoSuchProductException;

    List<T> getProductsInfo();
}
