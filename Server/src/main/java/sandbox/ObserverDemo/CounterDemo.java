package sandbox.ObserverDemo;

public class CounterDemo{
    public static void main(String[] args) {

        new Thread(() -> {
            int counter = 0;
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(++counter);
            }
        }).start();
    }
}
