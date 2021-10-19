package se.amir;

public class E2 {
    public void run(){
        System.out.println("Ange Height: ");
        int height = Integer.parseInt(System.console().readLine());
        System.out.println("Ange Width: ");
        int width = Integer.parseInt(System.console().readLine());  

        Rectangle rektangel = new Rectangle(height, width);
        System.out.printf("Arean av din rektangel är: %d\n", rektangel.calculateArea());
    }
}
