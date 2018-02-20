public class Methods {
    public static void main(String[] args) {

        sayHelloworld();
        sayHelloTo("Jozko");
        sayHelloTo("Dezko");

        int x = returnFive();
        System.out.println("x*x = " + x);
    }
    private static void sayHelloTo(String name) {
        System.out.println("Hello" + name );
    }

    private static void sayHelloworld(){
        System.out.println("HelloWorld");
    }

    private static int returnFive(){
        return 5;

    }
    static int square(int x){
    return x;
    }


}
