class palindrome_number {
    public static boolean isPalindromeNumber(int n) {
        int input = n;
        if (input < 0 || (input != 0 && input % 10 == 0))
            return false;
        int newInt = 0;
        int divisor = 1;
        while (divisor != 0) {
            divisor = input / 10;
            int remainder = input % 10;
            newInt = newInt * 10 + remainder;
            input = divisor;
        }
        if (newInt == n) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int input = 12321;
        System.out.println(isPalindromeNumber(input));
        input = 56;
        System.out.println(isPalindromeNumber(input));
    }
}
