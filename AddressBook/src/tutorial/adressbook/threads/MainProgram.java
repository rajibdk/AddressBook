package tutorial.adressbook.threads;

public class MainProgram {
    public static void main(String[] args) {
        Resource resource = new Resource();

        MyThread myThread1 = new MyThread("First", resource, 1);
        Thread thread1 = new Thread(myThread1);
        thread1.start();

        MyThread myThread2 = new MyThread("Second", resource, 2);
        Thread thread2 = new Thread(myThread2);
        thread2.start();

        MyThread myThread3 = new MyThread("third", resource, 0);
        Thread thread3 = new Thread(myThread3);
        thread3.start();
    }
}
