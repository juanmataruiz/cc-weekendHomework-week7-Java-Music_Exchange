package Stock;

import Behaviour.ISell;

public abstract class Accessory implements ISell {

    private String description;
    double boughtPrice;
    double soldPrice;

    public Accessory(String description, double boughtPrice, double soldPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.soldPrice = soldPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }
}
