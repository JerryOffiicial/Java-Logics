import java.lang.System;
import java.util.Random;

class WLoop{
    public static void main(String args[]){
        
        Random rand = new Random();
        int newNumber = 0;

        while(newNumber != 5){
            newNumber = rand.nextInt(10);
            System.out.println(newNumber);
        }
    }
}