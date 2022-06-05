package com.company;


public abstract class ParkIn  {             //abstraction class that BestFit and FirstCome extends it

    public Controller call=new Controller();
    public CaptureMyTime myTime=new CaptureTime();
    public abstract Slot parkIn(Slot[] arr, Vehicle car);       // a Park in Function that BestFit and FirstCome Overrides it with diff algorithms

}
