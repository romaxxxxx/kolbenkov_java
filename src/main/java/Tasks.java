import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    static Scanner consoleData = new Scanner(System.in);

    public static void main(String[] args) {
        nums();
        strings();
        arr();
    }

    public static void nums() {
        System.out.print("Введите число a: ");
        int a = consoleData.nextInt();
        System.out.print("Введите число b: ");
        int b = consoleData.nextInt();
        if (a > b) {
            System.out.println("a > b");
        }
        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + (float) a / b);
        System.out.println("a - b = " + (a - b));
    }

    public static void strings() {
        System.out.println("Введите строку а: ");
        String a = consoleData.next();
        System.out.println("Введите строку b: ");
        String b = consoleData.next();
        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
    }

    public static void arr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
