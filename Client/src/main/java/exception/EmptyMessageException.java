package exception;

public class EmptyMessageException extends RuntimeException{
    public EmptyMessageException(){
        super("Message cannot be empty!");
    }
}
