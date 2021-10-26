import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number # : " + count);

            boolean validNumber = scanner.hasNextInt();

            if (validNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();


    }
}

































