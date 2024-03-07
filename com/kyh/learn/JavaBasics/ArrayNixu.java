public class ArrayNixu {
    public static void main(String[] args) {
        int[] numbers ={7, 8, 6, 3, 1, 2, 4, 7, 9, 0};
        for(int i = 0, j = numbers.length - 1;i < j; i++, j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for(int i = 0; i < numbers.length; i ++){
            System.out.print(numbers[i]);
        }
    }
}
