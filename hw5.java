import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hw5 {
    // Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
    // Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
    // проснись
    public static void main(String[] args) {

        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(text);
    }

    static void collectStats(String text) {
        Map<Integer, List<String>> stats = new HashMap<>();
        List<String> arrString = Arrays.asList(text.split(" "));
        arrString.forEach(t -> {
            stats.merge(t.length(), new ArrayList<>(Arrays.asList(t)),
                    (oldList, newList) -> {
                        oldList.addAll(newList);
                        return oldList;
                    });
        });
        System.out.println(stats);
    }
}
