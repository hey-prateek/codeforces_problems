class SharedResource {
    private boolean flag = false;

    public synchronized void actionA(SharedResource other) {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + " waiting...");
            try { wait(); } catch (InterruptedException e) {}
        }
        flag = true;
        System.out.println(Thread.currentThread().getName() + " performing actionA");
        other.complete();
    }

    public synchronized void complete() {
        flag = false;
        notifyAll();
    }
}

public class temp {
    public static void main(String[] args) {
        SharedResource r1 = new SharedResource();
        SharedResource r2 = new SharedResource();

        Thread t1 = new Thread(() -> r1.actionA(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.actionA(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}
