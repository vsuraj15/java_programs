/*

Solid Square:
****
****
****
****

Hollow Square:
****
*  *
*  *
****

*/

class solidHollowSquare {
    public static void solidSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int input = 10;
        hollowSquare(input);
        System.out.println();
        solidSquare(input);
    }
}
