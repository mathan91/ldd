package src.code;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Board {

    int dimension;
    HashMap<Integer, SpecialItems> specialItems;

    public Board(int dimension, HashMap<Integer, SpecialItems> specialItems) {
        this.dimension = dimension;
        this.specialItems = specialItems;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<SpecialItems> getSpecialItems() {
        return specialItems.entrySet().stream().map(c -> c.getValue()).collect(Collectors.toList());
    }

    public void setSpecialItems(List<SpecialItems> specialItms) {
        specialItms.stream().collect(Collectors.toMap(SpecialItems::getPosition, c -> c));
    }

    void printBoard() {
        for (int i = dimension; i >= 0; i--) {
            System.out.print("|" + i + " ");
            if (hasSpecialItem(i))
                System.out.print(specialItems.get(i).getType());
            System.out.print("|");
            if (i % 10 == 0)
                System.out.println();
        }
    }

    SpecialItems getSpecialItem(int start) {
        return specialItems.get(start);
    }

    void addSpecialItem(SpecialItems specialItem) {
        specialItems.put(specialItem.start, specialItem);
    }

    void removeSpecialItem(SpecialItems specialItem) {
        specialItems.remove(specialItem.start);
    }

    boolean hasSpecialItem(int start) {
        return specialItems.get(start) != null;
    }
}