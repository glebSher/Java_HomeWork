import java.util.ArrayList;
import java.util.Scanner;

public class hw4_task1 {
// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке.
// Если введено exit, завершаем программу

// Пример:
// string~4
// num~3
// print~3

// num
// print~4
// string
// my_value~1
// print~1
// my_value

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> textArr = new ArrayList<>();
        ItemArray itemArr = new hw4_task1().new ItemArray();
        do {
            itemArr = parseString(scan.nextLine(), "`");
            if (itemArr.index != -1) {
                if (itemArr.text.equals("print")) {
                    boolean isOutOrEmpty = itemArr.index > textArr.size() || textArr.get(itemArr.index).isEmpty();
                    if (isOutOrEmpty) {
                        System.out.println("\"\"");
                    } else {
                        System.out.println(textArr.get(itemArr.index));
                        textArr.set(itemArr.index, "");
                    }
                } else
                    appendArrLst(textArr, itemArr);
            }
        } while (!itemArr.text.equals("exit"));
        scan.close();
    }

    public class ItemArray {
        String text;
        int index;
    }

    public static ItemArray parseString(String str, String sep) {
        String[] arr = str.split(sep);
        ItemArray item = new hw4_task1().new ItemArray();
        try {
            item.index = Integer.parseInt(arr[1]);
        } catch (Exception e) {
            item.index = -1;
        }
        if (item.index < 0)
            item.index = -1;
        item.text = arr[0];
        return item;
    }

    public static void appendArrLst(ArrayList<String> arr, ItemArray item) {
        if (item.index >= arr.size()) {
            for (int i = arr.size(); i <= item.index; i++) {
                arr.add("");
            }
        }
        arr.set(item.index, item.text);
    }
}