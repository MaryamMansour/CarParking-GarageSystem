package com.company;

public class Slot {         //Entity class for each slot
    public int width;
    public int depth;
    public boolean status;
    int id;
    int CarId;

    public Slot(int width,int depth,boolean status, int id, int CarId){     //parametirized constructor
        this.width=width;
        this.depth=depth;
        this.status=status;
        this.id= id;
        this.CarId=CarId;
    }
    public Slot()       //Default constructor
    {
        this.width=0;
        this.depth=0;
        this.status=false;
    }

    public void setCarId(int carId) {           //Setters and Getters
        CarId = carId;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }         //setter for the status

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public int getId() {
        return id;
    }
}
