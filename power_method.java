class power {
    public static int pow(int x, int n) {
        int value = 1;
        for (int i = 0; i < n; i++) {
            value *= x;
        }
        return value;
    }

    public static void main(String args[]) {
        int x = 4;
        int n = 2;
        System.out.println(pow(x, n));
    }
}
