package Threads.PrinterShop;

public class Printer implements Runnable {
    private int x;
    private int y;

    public synchronized void prints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Create a Printer instance for the first range
        Printer printer1 = new Printer();
        printer1.prints(10, 20);
        Thread thread1 = new Thread(printer1);
        thread1.start();
        thread1.join();

        // Create a Printer instance for the second range
        Printer printer2 = new Printer();
        printer2.prints(200, 210);
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }
}
