package Les_4OOP;
public class Main {
    public static void main(String[] args) {
        MathUtils<Integer> mathUtils = new MathUtils<>();
        int n = 11;
        System.out.println("Сумма чисел от 1 до " + n + " равна " + mathUtils.countNumbers(n));
        System.out.println("Факториал числа " + n + " равен " + mathUtils.factorial(n));
    }
}

// В этом коде создается объект mathUtils с помощью обобщенного типа Integer.
// Далее производятся вычисления с использованием методов countNumbers и factorial.
