class pattern7 {
    public static void main(String args[]) {
        int input = 10;
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = input - 1; i > 0; i--) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
