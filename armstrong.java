class armstrong {
    public static boolean isArmstrongNumber(int n) {
        int input = n;
        int expectedOutput = n;
        int counter = 0;
        int count = 0;
        int diviser = 1;
        while (diviser != 0) {
            diviser = n / 10;
            counter++;
            n = diviser;
        }
        count = counter;
        int sum = 0;
        while (counter != 0) {
            int remainder = input % 10;
            input = input / 10;
            sum += (int) Math.pow(remainder, count);
            counter--;
        }
        if (sum == expectedOutput) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int input = 371;
        System.err.println(isArmstrongNumber(input));
        input = 71;
        System.err.println(isArmstrongNumber(input));
    }
}
