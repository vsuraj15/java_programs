class pattern9 {
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
            int space = input - 1 - i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(j) * factorial(i - j)) + " ");
            }
            // for (int j = input - i; j >= 0; j--) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }
}
