package Threads;

public class ThreadDemo1 extends Thread {

    @Override
    public void run() {
        // executed by child thread
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.yield();
        }
    }


    public static void main(String[] args) {
        ThreadDemo1 td = new ThreadDemo1();

        td.start(); // starts a new thread
        // executed by main thread
        System.out.println(Thread.currentThread().getName());
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
        }

    }
}
