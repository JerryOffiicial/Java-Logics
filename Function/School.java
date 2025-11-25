import java.lang.System;
import java.util.Scanner;

public class School{

    String passorfail(int result){
        if(result<=35){
            return "Fail";
        }
        else{
            return "Pass";
        }
    }

    public static void main(String args[]){
       Scanner scan =new Scanner(System.in);
       int marks = scan.nextInt();
        School obj = new School();

       String result = obj.passorfail(marks); 
       System.out.print(result);
    }
}