import java.lang.System;
import java.util.Scanner;

class array2{
    public static void main(String args[]){
        int[] num = new int[10];
        int input;
        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();
        for(int i = 1; i<=10; i=i+1){
            System.out.println(i+"x"+input+"="+input*i);
        }
    }
}