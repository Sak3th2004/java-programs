import java.util.Scanner;

public class palindrim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}