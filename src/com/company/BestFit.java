package com.company;

public class BestFit extends ParkIn  {
                                        //A different Algorithm for the park in function

    public Slot parkIn(Slot[] arr, Vehicle car){
                                 // It returns the slot with the  minimum dimensions with the given car

        int min=0,tmp=0;
        int mysize = (car.depth+ car.width);
            for (int i=0; i < arr.length; i++) {
                if ((!arr[i].status) && (car.depth <= arr[i].depth) && (car.width <= arr[i].width))
                {  tmp = i; min=i;
                break;
            }}
        for (int j=tmp; j < arr.length; j++) {
            if ((!arr[j].status) && (car.depth <= arr[j].depth) && (car.width <= arr[j].width)){
                        if (((arr[j].depth + arr[j].width) - mysize) <= ((arr[min].depth + arr[min].width) - mysize))
                            min = j;
                                                     // loop that  returns the chosen index in the slot array
                    }
                }

        arr[min].id=min;
                                                    //mark the status slot with true and capture arrival time for the vehicle

        if ((!arr[min].status) && (car.depth <= arr[min].depth) && (car.width <= arr[min].width)) {
            arr[arr[min].id].setStatus(true);
            arr[arr[min].id].setCarId(car.id);
            call = new Controller(myTime);
            car.ArrivalTime = call.timeFun();

            return arr[min];
        }
        return null;
    }


}
