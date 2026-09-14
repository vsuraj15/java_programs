class reverseInteger {
    public static int reverseInt(int n) {
        int input = n;
        int divisor = 1;
        int newInt = 0;
        if (input < 10)
            return input;
        while (divisor != 0) {
            divisor = input / 10;
            int remainder = input % 10;
            newInt = newInt * 10 + remainder;
            input = divisor;
        }
        return newInt;
    }

    public static void main(String args[]) {
        int input = 5;
        System.out.println(reverseInt(input));
        input = 15;
        System.out.println(reverseInt(input));
    }
}
