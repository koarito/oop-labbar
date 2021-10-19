package se.amir;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){return age >= 18;}
    
    public String greetAsRovarsprak(){
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'o', 'u', 'å', 'e', 'i', 'y', 'ä', 'ö'));
        String greeting = "", mening = "Hej " + name;
       for(int i = 0; i < mening.length(); i++){
        if(Character.isLetter(mening.charAt(i)) && !vowels.contains(Character.toLowerCase(mening.charAt(i))))
        greeting = greeting + mening.charAt(i) + 'o' + mening.charAt(i);
        else 
        greeting = greeting + mening.charAt(i);
       }
       return greeting;
    }

}
