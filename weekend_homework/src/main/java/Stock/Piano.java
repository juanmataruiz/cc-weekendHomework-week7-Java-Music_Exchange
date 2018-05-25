package Stock;


public class Piano extends Instrument {

    private int numberOfKeys;
    private int numberOfStrings;

    public Piano(String colour, double boughtPrice, double soldPrice, Material material, InstrumentType instrumentType, String soundPlayed, int numberOfKeys, int numberOfStrings) {
        super(colour, boughtPrice, soldPrice, material, instrumentType, soundPlayed);
        this.numberOfKeys = numberOfKeys;
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    @Override
    public String play() {
        return "I make this sound: " + this.getSoundPlayed();
    }

    public double getMarkUp(){
        return this.getSoldPrice() - this.getBoughtPrice();
    }



}
