package com.company;

public class Garage {       //Entity class that stores the info about yoy garage
    int configuration;
    Slot []GarageSlots;
    int SlotSize;

    public Garage (){}

    public Garage ( int configuration , Slot[] GarageSlots, int SlotSize){       //parametrized constructor
        this.configuration=configuration;
        this.GarageSlots=GarageSlots;
        this.SlotSize=SlotSize;
    }

    public int getConfiguration() {         // Configuration getter
        return configuration;
    }
}
