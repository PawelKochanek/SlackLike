package sandbox.ObserverDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class InputProvider implements Observable{
    private final Scanner scanner = new Scanner(System.in);
    private List<Observer> observers = new ArrayList<>();

    public String getInput() {
        String input = scanner.nextLine();

        if(input.equals("q"))
            notifyAllObserver();
        return input;
    }


    @Override
    public void notifyAllObserver() {
        for(Observer tmp : observers){
            tmp.update();
        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeAttach(Observer observer) {
        observers.remove(observer);
    }
}
