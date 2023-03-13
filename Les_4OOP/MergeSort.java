package Les_4OOP;
// Для реализации алгоритма сортировки слиянием числового массива с использованием обобщений Java необходимо создать класс-утилиту, который может принимать любой тип данных, которые реализуют интерфейс Comparable и имеют метод compareTo для сравнения объектов. 
// Далее можно использовать следующий алгоритм для сортировки массива слиянием:
// 1. Разделить исходный массив на две равные части.
// 2. Рекурсивно вызвать сортировку на каждой из половинок, пока размер каждой части не будет меньше или равен 1.
// 3. Объединить отсортированные половинки в новый массив, сравнивая элементы между собой и добавляя их в нужном порядке в новый массив, пока не все элементы не будут добавлены в новый массив.
// 4. Вернуть отсортированный массив.
// Код для реализации предложенного алгоритма сортировки слиянием числового массива в соответствии с принципами ООП с использованием обобщений Java:

public class MergeSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        T[] tempArr = (T[]) new Comparable[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1, "");
    }

    private void mergeSort(T[] arr, T[] tempArr, int left, int right, String indent) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(arr, tempArr, left, middle, indent + "  ");
        mergeSort(arr, tempArr, middle + 1, right, indent + "  ");
        mergeHalves(arr, tempArr, left, right, middle, indent);
        writeLog(arr, indent);
    }

    private void mergeHalves(T[] arr, T[] tempArr, int left, int right, int middle, String indent) {
        for (int i = left; i <= right; i++) {
            tempArr[i] = arr[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (tempArr[i].compareTo(tempArr[j]) <= 0) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }

    private void writeLog(T[] arr, String indent) {
        System.out.print(indent + "Array: ");
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// С помощью этой реализации мы можем сортировать любые массивы, которые реализуют интерфейс Comparable, например, Int, Double, String и т.д. 