import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим значения a, b и x с клавиатуры
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // Вычисляем значение функции y = cos(ax) + b
        double y = Math.cos(a * x) + b;

        // Выводим результат
        System.out.println("Значение функции y при x=" + x + ": " + y);

        // Закрываем Scanner
        scanner.close();
    }
}
