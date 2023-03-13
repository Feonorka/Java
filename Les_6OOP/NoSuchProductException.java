package Les_6OOP;

// Класс NoSuchProductException, который будет использоваться при отсутствии продукта в автомате в соответствии с принципом ООП:

public class NoSuchProductException extends Exception {
    public NoSuchProductException(String message) {
        super(message);
    }
}
