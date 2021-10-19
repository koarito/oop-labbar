package se.amir;

public class Circle {
    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public double area(){
        double area = 3.14*radius*radius;
        return area;
    }
    public double circumference(){
        double circum = 2*3.14*radius;
        return circum;
    }
}
