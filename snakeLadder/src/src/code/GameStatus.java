package src.code;

public enum GameStatus {

    NOT_STARTED("NOT_STARTED"),
    STARTED("STARTED"),
    RUNNING("RUNNING"),
    FINISHED("FINISHED");

    String value;

    GameStatus(String value) {
        this.value = value;
    }
}
