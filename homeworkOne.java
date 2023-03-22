package basic.homeworks;
import java.util.Scanner;
public class homeworkOne {
    public static void main(String[] args) {
        int x = 54;
        int y = 16;
        System.out.println(x + y);
        int b = 50;
        int c = 3;
        System.out.println(b / c );
        System.out.println(-5 + 8 * 6);
        System.out.println((55+ 9) % 9);

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число");
        int n = scanner.nextInt();
        System.out.println(n * n);

        int num1 = 0;
        int num2 = 1;
        int num3 = 2;
        int num4 = 3;
        int num5 = 4;
        int num6 = 5;
        int num7 = 6;
        int num8 = 7;
        int num9 = 8;
        int num10 = 9;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double average = (double)sum / 10.0;

        System.out.println("среднее арифметическое: " + average );

        double price_1 = 1000;
        double price_2 = 500;
        double discount = 100;

        double total = price_1 + price_2 - discount;
        double discountPercent = (discount / (price_1 + price_2)) * 100.0;

        System.out.println("сумма покупки со скидкой" + total);
        System.out.println("процент скидки" + discountPercent + "%");

    }
}
