import java.util.Arrays;

// 3. Создать квадратный двумерный целочисленный массив (количество строк и 
// столбцов одинаковое),  * и с помощью цикла(-ов) заполнить его диагональные 
// элементы единицами.

public class hw1_task4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        printArray(array);
        System.out.println();
        int[][] newArray = diagonalFilling(array);
        printArray(newArray);
    }

    public static int[][] diagonalFilling(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == j) {
                        array[i][j] = 1;
                    } else {
                        continue;
                    }
                }
            }
            return array;
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}