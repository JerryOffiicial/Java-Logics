import java.util.Scanner;

class DWLoop{
    public static void main(String args[]){
        int i = 0;

        //Scenario 1
        do{
            System.out.println("Hello");
            i = i+1;
        }while(i<=1);

        //Scenario 2
        
        int num =0;
        Scanner scan= new Scanner(System.in);

        do{
            System.out.println("Enter a value that greater than 10: ");
            num =scan.nextInt();
        }while(num<=10);

    }
}