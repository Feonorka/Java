package Les_5OOP;
// В данном примере в переменных obj1 и obj2 сохраняется ссылка на единственный экземпляр класса Singleton,
// который был создан при первом вызове метода getInstance. Вызов метода doSomething() производится уже на этом экземпляре.
// В результате в консоль будет выведено две строки, что метод doSomething() был выполнен.
public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.doSomething();
        Singleton obj2 = Singleton.getInstance();
        obj2.doSomething();
    }
}
