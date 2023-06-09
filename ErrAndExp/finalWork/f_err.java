import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class IncorrectInputException extends RuntimeException {
    // класс исключения для неверного ввода данных
    public IncorrectInputException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваши данные (через пробел): ");
        String input = scanner.nextLine();

        try {
            String[] data = parseInput(input);

            String filename = data[0] + ".txt";
            FileWriter writer = new FileWriter(filename, true);
            writer.write(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + "\n");
            writer.close();
        } catch (IncorrectInputException e) {
            System.err.println("Ошибка ввода данных: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String[] parseInput(String input) {
        // разбиваем строку на части
        String[] parts = input.split(" ");
        if (parts.length != 4) {
            throw new IncorrectInputException("Неверное количество параметров. Ожидается 4.");
        }

        // проверяем формат фамилии, имени и отчества
        for (int i = 0; i < 3; i++) {
            if (!parts[i].matches("[a-zA-Zа-яА-ЯёЁ]+")) {
                throw new IncorrectInputException("Неверный формат ФИО. Разрешены только буквы.");
            }
        }

        // проверяем формат номера телефона
        if (!parts[3].matches("\\d+")) {
            throw new IncorrectInputException("Неверный формат номера телефона. Ожидается целое число.");
        }

        return parts;
    }
} 