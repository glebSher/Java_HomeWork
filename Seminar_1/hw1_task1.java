import java.util.Scanner;

public class hw1_task1 {
    public static void main(String[] args) {
        // int a = getNumberByUser("Введите число a:");
        // int b = getNumberByUser("Введите число b:");
        int a = 7;
        int b = 2;
        System.out.println(isSumBetween10And20(a, b)); // true or false
        
        int x = getNumberByUser("Введите число X:");
        System.out.println(isPositive(x)); // true or false
        
        // printString("abcd", 5); // abcdabcdabcdabcdabcd

    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
    // true, в противном случае – false.

    static int getNumberByUser(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        return n;
    }
    // проверка, что сумма a и b лежит между 10 и 20
    private static boolean isSumBetween10And20(int a, int b) { 
        int sum = a + b;
        if (sum >= 10 & sum <= 21) {
            return true;
        } else {
            return false;
        }
    }

    // проверить, что х положительное
    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    // напечатать строку source repeat раз
    // private static void printString (String source, int repeat) {

    // }

    // private static boolean isLeapYear(int year) {
    //     // проверить, является ли год високосным. если да - return true
    //     return false;
    // }

    // private static int[] createArray(int len, int initalValue) {
    //     // должен вернуть массив длины len, каждое значение которого равно initialValue
    //     return null;
    // }
}
