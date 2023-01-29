// Подсчет чисел от 1 до n + факториал n
package Les_1.Exp_1;

public class Exp_1 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + n + " равен " + result);
    }
}

