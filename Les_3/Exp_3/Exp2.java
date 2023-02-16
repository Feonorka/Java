public class Exp3 {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
    // Найти минимальное число в списке 
    int min = Collections.min(list); 
    System.out.println("Минимальное число: " + min); 
    
    // Найти максимальное число в списке  
    int max = Collections.max(list);  
    System.out.println("Максимальное число: " + max);  
    
    // Найти среднее значение из этого списка  
    double average = list.stream().mapToInt(val -> val).average().getAsDouble();  
    System.out.println("Средняя: " + average);
}