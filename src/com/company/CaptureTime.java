package com.company;
import java.time.LocalTime;

public class CaptureTime implements CaptureMyTime{

    public LocalTime getTime()         // A function that capture time from the system
    {
        return (LocalTime.now());
    }
}
