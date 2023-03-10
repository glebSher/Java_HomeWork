import java.util.Arrays;

// 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
// пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class hw1_task3 {
    public static void main(String[] args) {
        int [] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(array));
        int[] changeArray = arrMultBy2(array);
        System.out.println(Arrays.toString(changeArray));
    }
    static int[] arrMultBy2(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                newArray[i] = array[i] * 2;
            } else {
                newArray[i] = array[i];
            }
        } return newArray;
    }
}
