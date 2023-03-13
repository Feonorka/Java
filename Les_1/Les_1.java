package Les_1;
import java.util.Scanner;
/**
 * Les_1
 */
public class Les_1 {

    public static void main(String[] args)
    {
        // Просто вывод на печать
        System.out.println("Hi, World!");

        // Объявление одномерного массива
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        // Объявление многомерного массива
        int[] array[] = new int[3][5];
        for (int[] line : array)
        {
            for (int item : line)
            {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println();

        // Объявление многомерного массива (пример с циклом)
        int[][] array_2 = new int[3][5];
        for (int i = 0; i < array_2.length; i++)
        {
            for (int j = 0; j < array_2[i].length; j++)
            {
            System.out.printf("%d ", array_2[i][j]);
            }
        System.out.println();
        }

        // Запрос данных пользователя
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        Scanner iScanner_med = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner_med.nextInt();
        System.out.printf("double a: ");
        double y = iScanner_med.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner_med.close();
    }
}