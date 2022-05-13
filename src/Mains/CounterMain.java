package Mains;

import Classes.Counter;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increase();
        System.out.println(counter.value());
        counter.increase(2);
        System.out.println(counter.value());
        Counter counter2 = new Counter(5);
        counter2.increase();
        System.out.println(counter2.value());
        counter2.increase(2);
        System.out.println(counter2.value());
        counter2.decrease();
        System.out.println(counter2.value());
        counter2.decrease(-3);
        System.out.println(counter2.value());
    }
}
