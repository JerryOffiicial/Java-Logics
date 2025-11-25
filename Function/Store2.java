public class Store2{
    
    int sum(int a,int b){
        int c = a + b;
        return c;
    }

    public static void main (String args[]){
        Store2 store = new Store2();
        int result = store.sum(4,5);
        System.out.print(result);
    }
}