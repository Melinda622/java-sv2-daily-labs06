package day02.numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number) {
        int sum = 0;
        boolean result = false;

        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        PerfectNumbers perfect=new PerfectNumbers();
        System.out.println();
    }
}
