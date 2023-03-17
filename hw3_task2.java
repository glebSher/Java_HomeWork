import java.util.ArrayList;
import java.util.List;

public class hw3_task2 {
    // Дан список ArrayList<String>. Удалить из него все строки,
    // которые являются числами Пример: ArrayList<String> list =
    // new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
    // ["string", "s", "my_value"]
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        removeIntValue(list);
        System.out.println(list);
    }

    public static void removeIntValue(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            try {
                int n = Integer.parseInt(list.get(i));
                list.remove(i);
                i = i - 1;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
