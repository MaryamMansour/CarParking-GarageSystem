package com.company;

import java.time.LocalTime;

public class Vehicle {          //Entity class for the vehicle
    String model_name;
    int id;
    int model_year;
    int depth;
    int width;
    LocalTime ArrivalTime;
    LocalTime DepartureTime;
    long fees;

    public Vehicle(int width, int depth, int id, int model_year, String model_name)     //Paramitrized Constructor
    {   this.width=width;
        this.depth=depth;
        this.id=id;
        this.model_year=model_year;
        this.model_name=model_name;
    }
   
                                                //getters and setters
    public long getFees() {             //Getters for each of the fees , Id and time
        return fees;
    }

    public int getId() {
        return id;
    }

    public LocalTime getDepartureTime() {
        return DepartureTime;
    }

    public LocalTime getArrivalTime() {
        return ArrivalTime;
    }
}
