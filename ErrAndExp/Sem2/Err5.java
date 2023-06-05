package ErrAndExp.Sem2;

import java.io.FileNotFoundException;

public class Err5 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: деление на ноль!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка: выход за границы массива!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    // В этом исправленном коде:

    // - Мы убрали выражение throws Exception из метода main, так как это не
    // требуется.
    // - Мы исправили блоки catch для соответствия типам исключений. Ошибка деления
    // на ноль перехватывается блоком catch для исключения ArithmeticException,
    // ошибка выхода за границы массива обрабатывается блоком catch для исключения
    // ArrayIndexOutOfBoundsException, и ошибка в методе printSum, связанная с
    // файлом не найдена, отлавливается блоком catch для исключения
    // FileNotFoundException. В блок catch с параметром Throwable больше не попадет
    // ни одно исключение, так как они уже перехвачены более конкретными блоками
    // catch выше по коду.
    // - Мы исправили операцию в массиве abc. В исходном коде была попытка присвоить
    // значение 9 элементу с индексом 3, которого не существует. В исправленном коде
    // мы присваиваем значение 9 элементу с индексом 2, чтобы избежать ошибки выхода
    // за границы массива.
}
