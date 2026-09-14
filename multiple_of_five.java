import java.util.Arrays;

class multiple_of_five {
    public static int[] solve(int n) {
        var count = n / 5;
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 15;
        System.out.println(Arrays.toString(solve(input)));
    }
}
