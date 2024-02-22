package JavaAdvance;

public class MethodDemo {
    public static void main(String[] args) {
        playGame();
        System.out.println(getArea(5, 6));
    }

    public static void playGame(){
        System.out.println("Hello, Java!");
    }

    public static int getArea(int a, int b){
        return a * b ;
    }
}
