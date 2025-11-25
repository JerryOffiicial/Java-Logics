import java.lang.System;
import java.util.Scanner;

class array1{
    public static void main(String args[]){
        int[] marks= new int[5];
        Scanner scan =new Scanner(System.in);

        for(int i =0; i<=4; i=i+1){
            marks[i] =scan.nextInt();
        }

        for(int i = 0; i<=4; i=i+1){
            System.out.println("marks"+marks[i]);
        }
    }
}