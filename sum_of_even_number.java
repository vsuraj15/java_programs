class sumOfEvenNumber {
    public static int functionSum(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int input = 6;
        System.out.println(functionSum(input));
    }
}
