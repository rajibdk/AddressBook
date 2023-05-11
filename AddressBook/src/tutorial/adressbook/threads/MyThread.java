package tutorial.adressbook.threads;

public class MyThread implements Runnable {
    private String name;
    private Resource resource;
    private final int reminder;

    public MyThread(String name, Resource resource, int reminder) {
        this.name = name;
        this.resource = resource;
        this.reminder = reminder;
    }

    @Override
    public void run() {
        while (true) {
            if(resource.INDEX > 11) {
                break;
            }
            resource.setINDEX(reminder);
        }
    }
}
