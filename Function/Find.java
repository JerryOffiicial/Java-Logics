import java.lang.System;
import java.util.Scanner;

public class Find{
    void evenorodd(int num){
        if(num%2 == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Find obj =new Find(); 

        obj.evenorodd(input);

        
    }
}