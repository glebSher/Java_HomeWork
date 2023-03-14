import java.io.FileWriter;
import java.io.IOException;

// Создать файл с названием file.txt. Если файл уже есть, 
// то создавать не надо Записать в него Слово "TEXT" 100 раз.

public class hw2_task2 {
    public static void main(String[] args) {
        String line = "TEXT ";
        int count = 100;
        try (FileWriter fileWriter = new FileWriter("file.txt")) {
            fileWriter.append(line.repeat(count));
        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
            }
        }
    }

