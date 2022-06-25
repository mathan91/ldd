package src.code;

public class Snake extends SpecialItems {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getType() {
        return "src.code.Snake" + end;
    }
}
