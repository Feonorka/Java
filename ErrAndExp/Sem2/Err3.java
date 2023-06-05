package ErrAndExp.Sem2;
import java.util.Scanner;
public class Err3 {

        public static float readFloat(Scanner scanner) {
        System.out.print("Введите дробное число: ");
        try {
            return scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Некорректный ввод. Попробуйте снова.");
            scanner.nextLine();
            return readFloat(scanner);
        }
    }

    public static void main(String[] args, int[] intArray) {
        Scanner scanner = new Scanner(System.in);
        float number = readFloat(scanner);
        System.out.println("Введено число: " + number);
        
         
    }

    // В этом примере метод readFloat запрашивает у пользователя ввод дробного
    // числа, используя сканнер. Если введенное значение не является дробным числом,
    // метод отлавливает исключение, выводит сообщение об ошибке и повторно
    // запрашивает ввод с помощью рекурсии. Если же введенное значение корректно,
    // метод возвращает его.
}
