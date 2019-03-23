import java.time.LocalDateTime;

public class SlackLikeError {
    private LocalDateTime timestamp;
    private String message;

    /**
     * Constructor for serialization
     * ad various frameworks
     */
    private SlackLikeError(){
    }

    public SlackLikeError(String message){
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }
}
