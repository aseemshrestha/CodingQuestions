public class DeadLockJoin extends Thread {

    static Thread threadName;

    @Override
    public void run() {
        try {
            threadName.join();
         } catch (InterruptedException ex) {
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) throws InterruptedException {

        DeadLockJoin dl = new DeadLockJoin();
        threadName = Thread.currentThread();
        System.out.println("ThredName: " + threadName.getName());

        dl.start();
        dl.join(); // both threads are waiting on each other to complete ( using join )

        for (int i = 5; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }
}
