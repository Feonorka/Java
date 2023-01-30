package Les_1.Exp_1;

public class Exp_5
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        arr = new int[] { 1, 2, 3, 4, 5 };
        int val = 3;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == val)
            {
                count++;
                // удаляем элемент из массива по индексу i
                i--; // уменьшаем индекс на 1, чтобы не пропустить элементы, которые были сдвинуты влево.
            }  
        }
        //добавляем count раз val в конец arr.
        for (int j = 0; j < count; j++)
        {   
              
        }
    }
    
}
