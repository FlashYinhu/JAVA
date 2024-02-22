package JavaAdvance;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(numbers);
        System.out.println(containsNumber(numbers, 9));
    }

    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i]);
        }
        System.err.println();
    }

    public static boolean containsNumber(int[] a, int num){
        for(int i = 0; i < a.length; i ++){
            if(a[i] == num){
                return true; // return 会直接结束方法
            }
        }
        return false;
    }

}
