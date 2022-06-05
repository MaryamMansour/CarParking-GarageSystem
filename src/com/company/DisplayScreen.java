package com.company;

import java.util.Scanner;


public class DisplayScreen {

    int remaining,size,i;
    Garage MyGarage=new Garage();
    Scanner Input1 =new Scanner(System.in);
    Scanner Input2=new Scanner(System.in);
    Slot[] MySlots;
    Vehicle[] MyCars;
    boolean flag=true;
    Controller call =new Controller();
    DisplayMySlot DisplayObj= new DisplaySlot();
    //***************************************************************************************************************************

   public void startProgram(){

       startGarage();
       while(flag) {
                   showMenu();                              //function that starts the program and take the user's action as an input
                   int operation =  Input1.nextInt();
                   switch (operation) {
                       case 1 -> parkVehicle();
                       case 2 -> displayAvailableSlots();
                       case 3 -> parkOutVehicle();
                       case 4 -> calculateGarageIncome();
                       case 5 -> calculateNumberOfVehicles();
                       case 6 -> flag = false;
           }
       }
   }

    //***************************************************************************************************************************
   public void showMenu(){                      //function to show the user the operation menu
       System.out.println("""
               1- Park In Vehicle\s             
               2- Display available Slots\s
               3- Park Out Vehicle\s
               4- Get Garage Income
               5- Get Number Of Vehicles\s
               6- Exit\s
               ---------------------""");
   }
    //***************************************************************************************************************************
    public void startGarage(){

        System.out.println("Welcome to your Garage! \n --------------------- \n Enter number of garage slots");
         size = Input1.nextInt();
        MyCars = new Vehicle[1000];
        MySlots = new Slot[size];                                //arr of slots for the size
        remaining =size;
        for (int SlotID = 0; SlotID < size; SlotID++) {
            System.out.println("Enter width and depth for slot number " + (SlotID + 1));
            int width = Input1.nextInt();
            int depth = Input1.nextInt();                               //initialize each slot with the dimensions from the user
            MySlots[SlotID] = new Slot(width, depth, false, SlotID ,0);
        }
        System.out.println("Select a configuration \n 1- Best Fit     2-First come" );
        int num = Input1.nextInt();                                                           //take the configuration as an input
        MyGarage = new Garage(num, MySlots, size);      //creating a new garage with info

    }


//***************************************************************************************************************************
public void parkVehicle()
{
    ParkIn obj = null;          // a new abstract obj with null value


    if(remaining == 0)          //handling error if there's no remaining slots
        System.out.println("There's no empty slot for your vehicle ");
    else{
        System.out.println("Please identify your vehicle \n -enter width, depth of your vehicle");
        int w = Input1.nextInt();
        int d = Input1.nextInt();
        System.out.println("-enter your vehicle model year :");
        int y = Input1.nextInt();
        System.out.println("-enter your vehicle model name :");
        String m = Input2.nextLine();
                                                // initialize vehicle with the given input and give it an ID
        MyCars[i] = new Vehicle(w, d, i, y, m);
        System.out.println("-Your Vehicle ID is : "+ MyCars[i].getId());




        if (MyGarage.getConfiguration() == 1) {
            obj = new BestFit();}                       //initialize the obj with the suitable configuration
        if (MyGarage.getConfiguration() == 2) {
            obj = new FirstCome();}

        call =new Controller(obj);
        
        
            Slot chosen = call.parkInFun(MySlots,MyCars[i]);            //controller calls the ParkInFunction

            if (chosen == null)                                         //handling the error if there's no available slot for the car
                System.out.println( "There's no available slots" );
            else {
                System.out.println( "your parking slot is :" );     // display the chosen slot for the user
                System.out.println("-Slot Id: "+chosen.getId() +" -Slot dimensions :" +chosen.getWidth() + "," + chosen.getDepth() );    // chosen slot

                System.out.println( "\n--------------------");
                remaining--;        //decreasing the remaining slots by one
            }
            i++;
        }}


//************************************************************************************************************************

public void displayAvailableSlots()
{
        call = new Controller(DisplayObj);
            System.out.println("\n");
            if (remaining == 0) {         //handling error if there's no remaining slots
                System.out.println("There's no available slots");
            } else {
                System.out.println("Remaining available slots :");          //controller calls the displayFunction
                        call.displayFun(MySlots);                             //display all available slots

                System.out.println("\n");
            }
}
//************************************************************************************************************************

public void parkOutVehicle(){
    ParkVehicleOut Parkobj = new ParkOut();
    call = new Controller( Parkobj);
    boolean f = false;
    System.out.println("Enter ID for your out car");
    int OutCar = Input1.nextInt();
    for (int j = 0; j < i; j++){
    if(OutCar == MyCars[j].id) {        //get the Id of the car as an input
        Vehicle OutVehicle = call.parkOutFun(MyCars, MySlots, OutCar, i);       //controller calls the function to parkout the chosen car
        System.out.println("Time : " + OutVehicle.getDepartureTime());              //display the deprature time
        System.out.println("Your fees is " + OutVehicle.getFees());             //display the fees for the user
        remaining++;            //increasing the remaining slots by one
        f = true;
        break;
    }
    }
    if(!f)          //Handling the error if the given ID is not in the parked vehicles
    System.out.println("There's no vehicle with the given ID");



}

//************************************************************************************************************************

    public void calculateGarageIncome(){
        CalculateTotal obj= CalculateIncome.GetInstance();
        call = new Controller(obj);
        System.out.println("Your Income is " + call.getMoney());            // controller calls the getMonetFunction to get the income

        }


    //************************************************************************************************************************
    public void calculateNumberOfVehicles(){
       CalculateMyVehicles obj1 = new CalculateVehicles();
       call = new Controller(obj1);
        System.out.println("Total number Of vehicles that parked out : " + call.getVehiclesFun(MyCars, i));   // controller calls the getVehiclesFun to get the number of parked out vehicles

    }


}
