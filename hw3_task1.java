import java.util.ArrayList;
import java.util.Arrays;

public class hw3_task1 {
    // Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);
        removeOddValue(list);
        System.out.println(list);
    }

    public static void removeOddValue(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            }
        }
    }
}