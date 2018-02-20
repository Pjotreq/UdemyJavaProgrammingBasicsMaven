public class VariableScope {
    //because x is declared outside of anz method, it is in scope to all methods, in other words
    //any method can access it


    public static void main(String[] args) {
        int x;
        x = 5;
        System.out.println(x);

        setToTen();


    }

    private static void setToTen(){
        int x = 10;
        System.out.println(x);
    }

    private static void doSomethingLocally(){
        //because y is declared inside of this method, it is local to thid method, in other words
        //no other methods has acces to y
        int y = 100; //declaring and initilazing variable y
    }


}
