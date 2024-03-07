import java.util.Random;

public class MaxValue {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] numbers = new int[50];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rd.nextInt(100) + 1;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (maxNumber < numbers[i]){
                maxNumber = numbers[i];
            }

            if (minNumber > numbers[i]){
                minNumber = numbers[i];
            }
        }
        System.out.println("最大:" + maxNumber);
        System.out.println("最小:" + minNumber);

    }
}
