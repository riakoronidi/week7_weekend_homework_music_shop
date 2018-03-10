package accessories;

import items.Item;

public class MusicSheet extends Item{

    MusicSheet musicSheet;
    private int numberOfPages;

    public MusicSheet(double wholesalePrice, double retailPrice, int numberOfPages) {
        super(wholesalePrice, retailPrice);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
