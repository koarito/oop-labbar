package se.amir;

public class F7 {
    public void run(){
        Time tid = new Time(12, 15, 20);
        tid.addHours(13);
        System.out.printf("%d:%d:%d\n", tid.getHours(), tid.getMinutes(), tid.getSeconds());
    }
}
