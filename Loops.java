public class Loops {
    public static void main(String[] args) {

        forLoop();

        whileLoop();

        doWhileLoop();
        }

    private static void forLoop(){

        for(int x=0; x<11; x++){
            System.out.println(x);
        }

    }

    private static void whileLoop(){
        int x=0;
        while(x<11){
            System.out.println(x);
            x++;
        }
    }

    private static void doWhileLoop() {
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 11);
    }
}

