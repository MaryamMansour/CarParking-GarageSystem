package com.company;

public class CalculateIncome implements CalculateTotal {
    public long Money;
                        //  one object is needed for this class to calculate income which is static

    private static CalculateIncome instance = new CalculateIncome();
    private CalculateIncome(){          //Private constructors
    }
    public static CalculateIncome GetInstance(){
        return instance;
    }
    public void calculateTotal(long Money){                //override a function that takes fees for every car and add it to the total income
        instance.Money += Money;
    }

    public long getMoney()
    {return Money;}                                         // a getter that return the total Income

}
