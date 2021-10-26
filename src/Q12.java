import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for Prime Number checking: ");
        int number = scanner.nextInt();
        scanner.close();


        boolean value = false;
        if (number == 1) {
            System.out.println("This is not a prime number");
        } else {

            for (int i = 2; i <= number / 2; ++i) {
                // condition for non-prime number
                if (number % i == 0) {
                    value = true;
                    break;
                }
            }

            if (!value)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");

        }
    }
}
