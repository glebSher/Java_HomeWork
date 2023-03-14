// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, 
// начиная с c1. (6, 'a', 'b') -> "ababab"

public class hw2_task1 {
    public static void main(String[] args) {
        int count = 6;
        char c1 = 'a';
        char c2 = 'b';

        String result = createString(count, c1, c2);
        System.out.println(result);
    }

    public static String createString(int N, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        String s1 = Character.toString(c1);
        String s2 = Character.toString(c2);
        for (int i = 0; i < N/2; i++) {
            result = result.append(s1);
            result = result.append(s2);
        }
        return result.toString();
    }
}
