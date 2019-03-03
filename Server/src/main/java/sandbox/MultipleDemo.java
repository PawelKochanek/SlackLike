package sandbox;

public class MultipleDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultipleThreading("Adolf Pierwszy"));
        Thread thread2 = new Thread(new MultipleThreading("Adolf Drugi"));

        thread1.start();
        thread2.start();
    }
}
