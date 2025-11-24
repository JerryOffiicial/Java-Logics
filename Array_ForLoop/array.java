import java.lang.System;
import java.util.Scanner;

class array{
    public static void main(String args[]){

        int[] score = new int[5];
        Scanner scan = new Scanner(System.in);

        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();
        score[3] = scan.nextInt();
        score[4] = scan.nextInt();

        int total = score[0]+score[1]+score[2]+score[3]+score[4];
        System.out.println("The total is: " + total);

    }
}