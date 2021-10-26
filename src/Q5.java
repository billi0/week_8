public class Q5 {
    public static boolean isPalindrome(int number) {
        int a = number;
        int reverse = 0;

        //while number is not equal to 0
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        if (a == reverse) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }
}
