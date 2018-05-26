package MusicShop;

import Behaviour.ISell;
import Stock.DrumStick;
import Stock.Piano;


import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;


    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addInstrument(Piano piano) {
        this.stock.add(piano);
    }

    public void removeInstrument() {
        this.stock.remove(0);
    }

    public void addAccessory(DrumStick drumStick) {
        this.stock.add(drumStick);
    }

    public void removeAccessory() {
        this.stock.remove(0);
    }
}
