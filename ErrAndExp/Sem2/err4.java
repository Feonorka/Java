package ErrAndExp.Sem2;

public class err4 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        try {
            int d = 1;
            double catchedRes1 = intArray[2] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        System.out.println("Code continues to work");
    }
}

// В этом примере мы объявляем массив intArray и используем try-catch блок,
// чтобы перехватить исключение ArithmeticException, которое возникает при
// попытке деления на ноль. Мы производим деление элемента массива intArray[8]
// на ноль, чтобы получить это исключение. Если исключение возникает, мы выводим
// сообщение "Catching exception: " с информацией об исключении (в данном
// случае, сообщение будет: "Catching exception: java.lang.ArithmeticException:
// / by zero"). Если же исключение не возникает, программа просто продолжит
// работу.

// В данном примере после блока try-catch выводится сообщение "Code continues to
// work", чтобы показать, что программа продолжает работу после перехвата
// исключения. без try-catch блока программа просто завершится с ошибкой при
// попытке деления на ноль.