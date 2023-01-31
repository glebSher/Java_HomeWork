/*Написать программу вычисления n-ого треугольного числа */
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int n = getNumberByUser("Введите число ");
        int triangleNumber = calcTriangleNumber(n);
        System.out.println(triangleNumber);
    }

    static int getNumberByUser(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    static int calcTriangleNumber(int n) {
        int result = (n * (n + 1)) / 2;
        return result;
    }
}
