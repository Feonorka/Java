public class Exp3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        list.removeIf(number -> number % 2 == 0);

        System.out.println(list); // [1, 3, 5]
    }
}
