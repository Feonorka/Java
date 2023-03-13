package Les_4OOP;
// Для реализации алгоритма сортировки пузырьком числового массива с использованием обобщений Java необходимо создать класс-утилиту, который может принимать любой тип данных, которые реализуют интерфейс Comparable и имеют метод compareTo для сравнения объектов. 
// Далее можно использовать следующий алгоритм для сортировки массива:

// 1. Создать пустой лог-файл для записи результатов каждой итерации сортировки.
// 2. Пройтись по всему массиву и сравнить два элемента, начиная с первых двух.
// 3. Если первый элемент больше второго, то поменять их местами.
// 4. Продолжать сравнивать и менять элементы до тех пор, пока не достигнут конца массива. 
// 5. Повторять шаги 2-4 для всех элементов массива, пока массив не будет отсортирован.
// 6. В конце каждого прохода по массиву записывать текущее состояние массива в лог-файл.

// Код для реализации предложенного алгоритма сортировки пузырьком числового массива в соответствии с принципами ООП с использованием обобщений Java:

import java.util.logging.*;
import java.io.*;

public class BubbleSort<T extends Comparable<T>> {

    private static final Logger LOGGER = Logger.getLogger(BubbleSort.class.getName());

    public void sort(T[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    T temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            writeLog(arr);
        } while (swapped);
    }

    private void writeLog(T[] arr) {
        try {
            File file = new File("log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            StringBuilder sb = new StringBuilder();
            for (T element : arr) {
                sb.append(element).append(" ");
            }
            sb.append("\n");
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "An error occurred while writing log to file!", e);
        }
    }
}

// С помощью этой реализации мы можем сортировать любые массивы, которые реализуют интерфейс Comparable, например, Int, Double, String и т.д. 

public static void main(String[] args) {
    Integer[] arr = {5, 1, 4, 2, 8};
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    bubbleSort.sort(arr);
}

// В результате будет создан файл log.txt, в котором будет записано текущее состояние массива после каждой итерации сортировки:
