public class Store{
    void addition(int a, int b){
        System.out.println(a+b);
    }

    void substraction(int a, int b){
        System.out.println(a-b);
    }

    void multiply(int a, int b){
        System.out.println(a*b);
    }

    void division(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String args[]){
        Store obj = new Store();

        obj.addition(10,15);
        obj.substraction(15,10);
        obj.multiply(10,15);
        obj.division(15,15);

    }
}