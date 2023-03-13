package Les_4OOP;

// Для подсчета чисел от 1 до n и вычисления факториала числа n можно использовать обобщенные методы в Java.
// Создадим обобщенный класс MathUtils, имеющий два обобщенных метода: countNumbers и factorial.

public class MathUtils<T extends Number> {
    public int countNumbers(T n) {
        int count = 0;
        for (int i = 1; i <= n.intValue(); i++) {
            count += i;
        }
        return count;
    }

    public long factorial(T n) {
        long result = 1;
        for (int i = 2; i <= n.intValue(); i++) {
            result *= i;
        }
        return result;
    }
}

// В этом классе объявлены два обобщенных метода:
// - Метод countNumbers принимает обобщенный параметр n, ограниченный с помощью extends, и возвращает сумму чисел от 1 до n.
// - Метод factorial также принимает обобщенный параметр n, ограниченный подклассом класса Number, и возвращает факториал числа n.
// Теперь можно создать объект класса MathUtils и использовать его методы для вычислений.

