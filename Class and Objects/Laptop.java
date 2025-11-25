public class Laptop{
    String name="";
    String proc="";
    int ram= 0;
    int price= 0;

    public static void main(String args[]){
        Laptop lap1 =new Laptop();
            lap1.name="Hp";
            lap1.proc="i5";
            lap1.ram=4;
            lap1.price=40000;

            System.out.println("Laptop one");
            System.out.println("Laptop name: "+lap1.name);
            System.out.println("Laptop processor: "+lap1.proc);
            System.out.println("Laptop ram: "+lap1.ram);
            System.out.println("Laptop price: "+lap1.price);
            System.out.println();


        Laptop lap2 =new Laptop();
            lap2.name="Lenovo";
            lap2.proc="i7";
            lap2.ram=8;
            lap2.price=80000;

            System.out.println("Laptop two");
            System.out.println("Laptop name: "+lap2.name);
            System.out.println("Laptop processor: "+lap2.proc);
            System.out.println("Laptop ram: "+lap2.ram);
            System.out.println("Laptop price: "+lap2.price);
            System.out.println();


        Laptop lap3 =new Laptop();
            System.out.println("Laptop three");
            System.out.println("Laptop price: "+lap3.price+" //It will be the default value, since lap3 didnt have a value");

    }

}