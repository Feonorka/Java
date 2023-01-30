package Les_2.Exp_2;

import java.io.FileWriter;
import java.io.IOException;

public class Exp2 {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};

        try (FileWriter writer = new FileWriter("log.txt", false)) {

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }

                    String strArray = "";

                    for (int k : array) {
                        strArray += k + " ";
                    }

                    writer.write(strArray); // запись в файл log.txt результатов каждой итерации сортировки пузырьком числового массива 
                }

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}