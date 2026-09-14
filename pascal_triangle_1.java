class pattern8 {
    public static int factorial(int i) {
        int output = 1;
        if (i == 0)
            return output;
        for (int index = i; index >= 1; index--) {
            output *= index;
        }
        return output;
    }

    public static void main(String args[]) {
        int input = 6;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print(" ");
                // }
                // for (int k = 1; k <= i+1; k++) {
                System.out.print(factorial(i) / (factorial(j) * factorial(i - j)));
            }
            // for (int j = 0; j < input - i; j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }
}
