public class DeadLockSync extends Thread {

    static class A {
        synchronized void methodA(B b) {
            System.out.println("Inside A's methodA");
            try {
                Thread.sleep(1000);
              } catch (InterruptedException ex) {
            }
            b.lastMethod();
        }

        synchronized void lastMethod() {
            System.out.println("Inside A's last method");
        }
    }

    static class B {

        synchronized void methodB(A a) {
            System.out.println("Inside B's methodB");
            try {
                Thread.sleep(1000);
              } catch (InterruptedException ex) {
            }
            a.lastMethod();
        }

        synchronized void lastMethod() {
            System.out.println("Inside B's last method");
        }
    }

    static class MyThead extends Thread {

        A a;
        B b;

        MyThead(A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            b.methodB(a);
        }
    }

    public static void main(String[] args) {
        A a = new DeadLockSync.A();
        B b = new DeadLockSync.B();
        MyThead myThead = new MyThead(a, b);
        myThead.start();
        a.methodA(b);
    }
}
