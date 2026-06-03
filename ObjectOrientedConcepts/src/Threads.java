class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i =0 ; i<10; i++){
            System.out.println("hi");
            try {
                Thread.sleep(1000);  // making the t1 thread sleep
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i =0 ; i<10 ; i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);  // making the t2 thread sleep
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
//        System.out.println(t1.getPriority()); Get the priority of a thread
//        t1.setPriority(Thread.MAX_PRIORITY);  Assigning maximum peiority to the thread 1
    }
}
