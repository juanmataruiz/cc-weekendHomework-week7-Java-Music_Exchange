package Stock;

public class Violin extends Instrument {

    private int numberOfStrings;

    public Violin(String colour, double boughtPrice, double soldPrice, Material material, InstrumentType instrumentType, int numberOfStrings, String soundPlayed) {
        super(colour, boughtPrice, soldPrice, material, instrumentType, soundPlayed);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "I make this sound: " + this.getSoundPlayed();
    }

    public double getMarkUp() {
        return this.getSoldPrice() - this.getBoughtPrice();
    }
}
