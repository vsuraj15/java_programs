class factorial {
    public static int calculateFactorial(int n) {
        int output = 1;
        for (int i = n; i >= 1; i--) {
            output *= i;
        }
        return output;
    }

    public static void main(String args[]) {
        int input = 5;
        System.out.println(calculateFactorial(input));
    }
}
