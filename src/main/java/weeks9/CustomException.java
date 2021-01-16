package weeks9;

public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    // root cause 를 담아서 던지는게 best practice
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
