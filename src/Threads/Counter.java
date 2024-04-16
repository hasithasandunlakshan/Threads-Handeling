package Threads;

public class Counter {
    private int c = 0;
    public  void increment() {
        c++;
    }
    public  void decrement() {
        c--;
    }
    public synchronized int value() {
        return c;
    }
    public static void main(String args[]){
        Counter counter1=new Counter();
        counter1.c=5;
        counter1.increment();
        counter1.decrement();
        System.out.println(counter1.c);
    }
}