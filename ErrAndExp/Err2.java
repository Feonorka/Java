package ErrAndExp;

public class Err2 {
    public int[] diffArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 != len2) {
            System.out.println("Длины массивов не равны");
            return null;
        }
        int[] result = new int[len1];
        for (int i = 0; i < len1; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
