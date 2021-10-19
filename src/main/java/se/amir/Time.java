package se.amir;

import java.time.LocalTime;

public class Time {
    private LocalTime localTime;
   
public Time(int hour, int minute, int second){
    super();
    this.localTime = LocalTime.of(hour, minute, second);
}

    public void setHours(int hour){
        this.localTime = LocalTime.of(hour, localTime.getMinute(), localTime.getSecond());
    }
    public int getHours(){return localTime.getHour();}
    
    public void setMinutes(int minutes){
        this.localTime = LocalTime.of(localTime.getHour(), minutes, localTime.getSecond());
    }
    public int getMinutes(){return localTime.getMinute();}
    
    public void setSeconds(int seconds) {
        this.localTime = LocalTime.of(localTime.getHour(), localTime.getMinute(), seconds);
    }
    public int getSeconds(){return localTime.getSecond();}

    public void addHours(int x){
        localTime = localTime.plusHours(x);
    }
    public void addMinutes(int x){
        localTime = localTime.plusMinutes(x);
    }
    public void addSeconds(int x){
        localTime = localTime.plusSeconds(x);
    }
}
