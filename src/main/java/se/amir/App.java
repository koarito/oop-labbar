package se.amir;

public final class App {
    private App() {
    }
        public static void main(String[] args) {
        F7 labb7 = new F7();
        labb7.run();
        
        F6 labb6 = new F6();
        labb6.run();
        
        F5 labb5 = new F5();
        labb5.run();
        
        E4 labb4 = new E4();
        labb4.run();
        
        E3 labb3 = new E3();
        labb3.run();
        
        E2 labb2 = new E2();
        labb2.run();
        
        Point labb1 = new Point(12, 4);
        System.out.println(labb1.getX() + "," + labb1.getY());
    }
}
