public class MultipleThreading implements Runnable {
    private final String name;

    public MultipleThreading(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("hello from " + name);
    }
}
