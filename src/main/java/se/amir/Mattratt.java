package se.amir;

public class Mattratt {
    private String name;
    private int price;
    private String type;
    private int kcal;

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void setPrice(int price){this.price = price;}
    public int getPrice(){return price;}
    public void setType(String type){this.type = type;}
    public String geType(){return type;}
    public void setKcal(int kcal){this.kcal = kcal;}
    public int getKcal(){return kcal;}

    public Mattratt(String name, int price, String type, int kcal) {
        super();
        setName(name);
        setPrice(price);
        setType(type);
        setKcal(kcal);
    }
}
