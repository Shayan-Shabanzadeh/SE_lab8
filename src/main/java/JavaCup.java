import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        sumOfSquares(100000);
        temp();
        eval(i, j, k);
    }

    public static void eval(int i, int j, int k) {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void temp() {
        ArrayList<Integer> a = new ArrayList<>(10000 * 2000);

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 2000; j++) {
                a.add(i + j);
            }
        }
    }

    public static void sumOfSquares(int limit) {
    int sum =limit * (limit + 1) * (2 * limit + 1) / 6;
    System.out.println("sum is : " + sum);
}

}
