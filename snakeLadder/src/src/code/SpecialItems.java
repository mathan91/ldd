package src.code;

public class SpecialItems {

    int start;
    int end;

    public SpecialItems(int start, int end) {
        this.start = start;
        this.end = end;
    }

    int getPosition() {
        return start;
    }

    public String getType() {
        return "SplItem";
    }
}
