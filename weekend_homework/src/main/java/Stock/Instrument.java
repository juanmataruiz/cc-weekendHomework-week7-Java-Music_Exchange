package Stock;

import Behaviour.IPlay;
import Behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String colour;
    private double boughtPrice;
    private double soldPrice;
    private Material material;
    private InstrumentType instrumentType;
    private String soundPlayed;


    public Instrument(String colour, double boughtPrice, double soldPrice, Material material, InstrumentType instrumentType, String soundPlayed) {
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        this.soldPrice = soldPrice;
        this.material = material;
        this.instrumentType = instrumentType;
        this.soundPlayed = soundPlayed;
    }

    public String getColour() {
        return colour;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public Material getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return instrumentType;
    }

    public String getSoundPlayed() {
        return soundPlayed;
    }
}
