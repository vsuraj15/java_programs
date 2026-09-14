/*

* *
* *
* * * *
* * * *
* * * * * *
* * * * * *

*/

class staircasePattern {
    public static void display(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                k = i + 1;
            } else {
                k = i;
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int input = 20;
        display(input);
    }
}
