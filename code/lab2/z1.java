import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x:");
        double x = scanner.nextDouble();

        System.out.println("Введите значение a:");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b:");
        double b = scanner.nextDouble();

        double y;

        if (x >= 2) {
            y = Math.sqrt(1 + x * Math.sqrt(a * x));
        } else {
            y = a * Math.sin(b * x) + 3;
        }

        System.out.println("Значение функции y = f(x) при x = " + x + ": " + y);
    }
}
