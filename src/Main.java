import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        scanner.close();

        System.out.println("Сумма: " + (number1 + number2));
        System.out.println("Разность: " + (number1 - number2));
        System.out.println("Произведение: " + (number1 * number2));
        System.out.println("Частное: " + ((double)number1 / number2));
    }
}