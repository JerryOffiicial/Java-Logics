public class Hotel{
    int tea= 10;
    int coffee = 20;

    public static void main (String args[]){
        Hotel server1 = new Hotel(); //Hotel -class Name. A blue print that's getting shaped by Objects
        Hotel server2 = new Hotel(); 

        System.out.println(server1.tea);
        System.out.print(server2.coffee);
    }
}