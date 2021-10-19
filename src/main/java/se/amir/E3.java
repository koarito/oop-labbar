package se.amir;

public class E3 {
   public void run(){
       System.out.println("Ange radius: ");
       double radius = Double.parseDouble(System.console().readLine());
       Circle cirkel = new Circle(radius);
       System.out.printf("Arean av din cirkel är: %.2f\n", cirkel.area());
       System.out.printf("Omkretsen av din cirkel är: %.2f\n", cirkel.circumference());
   } 
}
