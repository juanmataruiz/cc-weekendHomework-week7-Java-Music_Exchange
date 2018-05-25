package Stock;

public class DrumStick extends Accessory {

    private double lenght;

    public DrumStick(String description, double boughtPrice, double soldPrice, double lenght) {
        super(description, boughtPrice, soldPrice);
        this.lenght = lenght;
    }


}
