package ArrayExmaple.ArraySum;

public class ArraySum {

    public static void main(String[] args) {
        int [] array = {1,3,4,6,7,8,9,12,13,15, 2};
        int sum = 0;

        for (int index = 0; index < array.length; index ++) {
            if(array[index] % 2 == 0){
                sum += array[index];
            }

        }
        System.out.print(sum);
    }
}
