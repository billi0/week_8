public class Q4 {
    public static void main(String[] args) {
        sumDigits(125);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number == 10) return 1;
        //for numbers less than 0 and between 0 and 9
        if (number < 0 || (number >= 0 && number <= 9)) {
            System.out.println("-1");
        } else {
            sum += number % 10;
            while ((number = number / 10) >= 1) {
                sum += (number > 10) ? number % 10 : number;
            }
            System.out.println(sum);
        }
        return sum;
    }
}
