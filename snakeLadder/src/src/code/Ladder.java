package src.code;

public class Ladder extends SpecialItems {


    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    int getPosition() {
        return super.getPosition();
    }

    @Override
    public String getType() {
        return "src.code.Ladder" + end;
    }
}
