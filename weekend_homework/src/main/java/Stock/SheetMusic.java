package Stock;

public class SheetMusic extends Accessory{

    private String style;

    public SheetMusic(String description, double boughtPrice, double soldPrice, String style) {
        super(description, boughtPrice, soldPrice);
        this.style = style;
    }
}
