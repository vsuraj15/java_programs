class positive_number_counter {
    public static int counter(int[] input) {
        var count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] input = { -2, 5, 7, -1, 3 };
        System.out.println(counter(input));
        int[] input1 = { -2, -10 };
        System.out.println(counter(input1));
    }
}
