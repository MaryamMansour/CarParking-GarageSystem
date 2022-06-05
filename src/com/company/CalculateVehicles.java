package com.company;

public class CalculateVehicles implements CalculateMyVehicles{
    public int NumOfVehicles;           //number of parked out vehicles

   public int calculateVehicle(Vehicle [] MyCars ,int TotalCars){
        for(int j=0; j<TotalCars ;j++)
        {
            if(MyCars[j].getId() == -1 )        //count the vehicles with Ids (-1) means that parked out
                NumOfVehicles++;

        }
        return NumOfVehicles;           //return num of parked out vehicles
    }

}
