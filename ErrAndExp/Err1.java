package ErrAndExp;

public class Err1 {
    // 1. Метод, где возникает исключение ArrayIndexOutOfBoundsException:
    public void arrayIndexOutOfBounds() {
        int[] arr = new int[3];
        System.out.println(arr[3]); // Доступ к несуществующему элементу массива
    }

    // 2. Метод, где возникает исключение NullPointerException:

    public void nullPointerException() {
        String s = null;
        System.out.println(s.length()); // Обращение к свойству null-ссылки
    }

    // 3. Метод, где возникает исключение ArithmeticException:

    public void arithmeticException() {
        int x = 10;
        int y = 0;
        int z = x / y; // Деление на нуль
        System.out.println(z);
    }
}