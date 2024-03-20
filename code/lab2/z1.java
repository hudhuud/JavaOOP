import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x (-1 <= x < 1):");
        double x = scanner.nextDouble();

        System.out.println("Введите количество итераций (n):");
        int n = scanner.nextInt();

        double S = 0;
        int iterations = 0;

        for (int i = 1; i <= n; i++) {
            double an = (calculateInnerSum(i) * Math.pow(x, i + 1)) / (i + 1);
            S += 2 * an;
            iterations++;
        }

        System.out.println("Значение функции S: " + S);
        System.out.println("Количество итераций: " + iterations);
    }

    private static double calculateInnerSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
