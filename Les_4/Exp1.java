package Les_4;

public class Exp1 {
    public static void reverseList(List<?> list)
    {
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}