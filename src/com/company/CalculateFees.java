package com.company;

import java.time.temporal.ChronoUnit;


public class CalculateFees implements CalculateMoney {
    public Controller call=new Controller();
   public CalculateTotal obj= CalculateIncome.GetInstance();

    public long calculateMyFees(Vehicle MyVehicle)      //override a function that gets the duration of parking and calculate each hour for 5 EGP
    {

        long Hours = ChronoUnit.HOURS.between(MyVehicle.DepartureTime, MyVehicle.ArrivalTime); //function gets the diff between arrival and departure time
        call = new Controller(obj);
        call.incomeFun((Hours +1 ) * 5);        //the controller with each calculation of fees adds it to the total income
        return  ((Hours +1 ) * 5);


    }


}
