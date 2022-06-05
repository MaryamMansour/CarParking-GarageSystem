package com.company;

public class FirstCome extends ParkIn  {
                        //A different Algorithm for the park in function
    public Slot parkIn(Slot[] arr, Vehicle car) {
                                            //it returns the first empty slot as long as it fits the vehicle
        for (int j = 0; j < arr.length; j++)
            if ((!arr[j].status )&& (car.depth <= arr[j].depth) && (car.width <= arr[j].width))
                arr[j].id = j;             // loop that  returns the chosen index in the slot array

        for (int i = 0; i < arr.length; i++)
            if ((!arr[i].status )&& (car.depth <= arr[i].depth) && (car.width <= arr[i].width)) {
                arr[arr[i].id].setStatus(true);      //mark the status slot with true and capture arrival time for the vehicle
                arr[arr[i].id].setCarId(car.id);
                call = new Controller(myTime);
                car.ArrivalTime = call.timeFun();
                return arr[i];
            }
        return null;
    };



}