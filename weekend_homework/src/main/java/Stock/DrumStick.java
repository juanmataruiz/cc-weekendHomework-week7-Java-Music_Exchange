package Stock;

public class DrumStick extends Accessory {

    private double length;

    public DrumStick(String description, double boughtPrice, double soldPrice, double length) {
        super(description, boughtPrice, soldPrice);
        this.length = length;
    }


    public double getDrumstickLength() {
        return this.length;
    }

    public double getMarkUp() {
        return this.getSoldPrice() - this.getBoughtPrice();
    }

}
