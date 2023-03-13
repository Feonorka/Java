package Les_4OOP;
// Для решения этой задачи можно создать класс PrimeNumbers, в котором реализовать обобщенный метод isPrime,
// который будет определять, является ли переданное число простым или нет, а также метод printPrimeNumbers,
// который будет выводить все простые числа на экран.
public class PrimeNumbers<T extends Number> {
    public boolean isPrime(T number) {
        long n = number.longValue();
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printPrimeNumbers(T max) {
        for (int i = 2; i <= max.intValue(); i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
// В этом коде объявляется обобщенный класс PrimeNumbers с двумя методами:
// - Метод isPrime принимает обобщенный параметр number, ограниченный подклассом Number, и возвращает true, если число является