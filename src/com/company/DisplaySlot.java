package com.company;

public class DisplaySlot implements DisplayMySlot {

    public void display(Slot[] ThisSlot)
    {
        for (int k = 0; k < ThisSlot.length; k++) {     //Function that loops on the array of slots and print the empty ones of them
         if(!ThisSlot[k].status)
                System.out.println("-Slot Id: "+ThisSlot[k].id +" -Slot dimensions :" +ThisSlot[k].width + "," + ThisSlot[k].depth );        //display all available slots

}
    }}