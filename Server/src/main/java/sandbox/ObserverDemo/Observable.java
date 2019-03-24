package sandbox.ObserverDemo;

public interface Observable {
    void notifyAllObserver();
    void attach(Observer observer);
    void removeAttach(Observer observer);
}
