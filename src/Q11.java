public class Q11 {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {
        int total = 0;

        if (number > 0) {

            while (number != 0) {
                int even = number % 10;

                if (even % 2 == 0) {
                    total += even;
                }

                number /= 10;
            }

            System.out.println(total);
        } else {
            System.out.println("-1");
        }

        return -1;
    }
}
