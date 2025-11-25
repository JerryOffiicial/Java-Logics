public class Mobile{
    void iphone(){
        System.out.println("This is an Iphone");
    }

    void samsung(){
        System.out.println("This is a Samsung");
    }

    void oppo(){
        System.out.println("This is an Oppo");
    }
    
    // Addition
    int a= 5;
    int b=10;

    void addition(){
        System.out.print(a+b);
    }

    public static void main(String args[]){
        Mobile obj = new Mobile();// We are calling this to get the non-static functions

        obj.iphone();
        obj.samsung();
        obj.oppo();
        obj.addition();
    }
}