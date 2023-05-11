package tutorial.adressbook.threads;

public class Resource {
    volatile Integer INDEX = 0;
    boolean isIncremented = false;
    Object object = new Object();

     public void setINDEX(int reminder) {
        synchronized (object) {
            while (INDEX % 3 != reminder) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.INDEX = INDEX + 1;
            System.out.println("From " + Thread.currentThread().getName() + " thread: " + INDEX);
            object.notifyAll();
        }
    }
}
