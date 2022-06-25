package src.code;

public class GameAlreadyStartedException extends RuntimeException{

    String exception;
    public GameAlreadyStartedException(String exception) {
        super(exception);
    }
}
