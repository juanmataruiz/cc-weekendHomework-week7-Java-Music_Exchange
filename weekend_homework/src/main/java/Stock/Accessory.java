package Stock;

public abstract class Accessory {

    private String description;
    double boughtPrice;
    double soldPrice;

    public Accessory(String description, double boughtPrice, double soldPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.soldPrice = soldPrice;
    }
}
