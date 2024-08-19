import java.io.File;
import java.util.Scanner;

/**
 * C:/Users/Desktop/test/1.txt
 */

public class Main {
    public static void main(String[] args) {

        var counts = 0;

        while (true) {
            System.out.print("Введите путь: ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);

            boolean fileExists = file.exists();

            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Путь указан НЕ верно");
                continue;
            } else {
                System.out.println("Путь указан верно");
                counts++;
                System.out.println("Это файл номер " + counts);
            }
        }
    }
}