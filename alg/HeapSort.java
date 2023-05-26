package alg;

public class HeapSort {
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void sort(int arr[]) {
        int n = arr.length;

        // построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // извлекаем элементы из кучи один за другим
        for (int i = n - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // функция для восстановления свойства пирамидальной кучи 
    void heapify(int arr[], int n, int i) {
        int largest = i; // инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // рекурсивно создание пирамиды для затронутого поддерева
            heapify(arr, n, largest);
        }
    }
}
