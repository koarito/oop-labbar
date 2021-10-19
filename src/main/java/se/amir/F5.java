package se.amir;
import java.util.ArrayList;
import java.util.Arrays;

public class F5 {
    public void run(){
        Mattratt förRätt = new Mattratt("Ostrullar", 65, "vegetarisk", 600);
        Mattratt huvudRätt = new Mattratt("Oxfilépasta", 120, "kött", 1000);
        Mattratt efterRätt = new Mattratt("Saffransglass med karamelliserade valnötter", 90, "vegetarisk", 250);    
        ArrayList <Mattratt> lunchmeny = new ArrayList<>(Arrays.asList(förRätt, huvudRätt, efterRätt));
        for(Mattratt dish : lunchmeny){
            System.out.printf("%s pris: %dkr\n", dish.getName(), dish.getPrice());
            System.out.printf("Rätten är av typen %s och innehåller %d kcal\n", dish.geType(), dish.getKcal());
        }

    }
}
