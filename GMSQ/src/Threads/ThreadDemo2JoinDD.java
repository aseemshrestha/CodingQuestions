package Threads;

public class ThreadDemo2JoinDD extends Thread {
    @Override
    public void run() {
        try {
            ThreadDemo2JoinDD.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child:" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo2JoinDD td = new ThreadDemo2JoinDD();
        td.start();
        td.join();
        for (int i = 10; i < 20; i++) {
            System.out.println("Main:" + i);
        }
    }

}
