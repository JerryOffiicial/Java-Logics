public class Name{
    String getName(){
        return "Jerry";
    }

    public static void main(String args[]){
        Name obj = new Name();
        String result = obj.getName(); //can get the return value from this function.

        System.out.print(result);
    }
}