import java.util.Scanner;

public class sum_of_digit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = addDigits(num);
        System.out.println("Sum of digits: " + sum);
    }

    public static int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}