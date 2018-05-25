package MusicShop;

import Behaviour.ISell;


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
}
