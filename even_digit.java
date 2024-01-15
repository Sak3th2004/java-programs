import java.util.Scanner;

public class even_digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        System.out.println("Sum of even digits: " + sum);
    }
}