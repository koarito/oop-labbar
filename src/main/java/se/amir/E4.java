package se.amir;

public class E4 {
    public void run(){
        System.out.println("Ange ditt namn: ");
        String name = System.console().readLine();
        System.out.println("Ange din ålder: ");
        int age = Integer.parseInt(System.console().readLine());
        Person player1 = new Person(name, age);
        System.out.println(player1.greetAsRovarsprak());
        System.out.println("Checkar om du är vuxen.......");
        System.out.println(player1.isAdult());

    }
}
