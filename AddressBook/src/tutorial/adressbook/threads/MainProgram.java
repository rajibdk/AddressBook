package tutorial.adressbook.threads;

import java.util.concurrent.*;

public class MainProgram {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Resource resource = new Resource();

        /*MyThread myThread1 = new MyThread("First", resource, 1);
        Thread thread1 = new Thread(myThread1);
        thread1.start();

        MyThread myThread2 = new MyThread("Second", resource, 2);
        Thread thread2 = new Thread(myThread2);
        thread2.start();

        MyThread myThread3 = new MyThread("third", resource, 0);
        Thread thread3 = new Thread(myThread3);
        thread3.start();*/


        MyThread myThread3 = new MyThread("third", resource, 0);
        MyThread myThread2 = new MyThread("Second", resource, 2);
        MyThread myThread1 = new MyThread("First", resource, 1);

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.submit(myThread1);
        executorService.submit(myThread2);
        executorService.submit(myThread3);
        executorService.schedule(myThread1, 10, TimeUnit.SECONDS);
        executorService.shutdown();
    }
}
