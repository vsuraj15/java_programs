/*

********************
*                  *
*                  *
*                  *
*                  *
********************

*/

class hollowRectangle {
    public static void display(int l, int b) {
        for (int i = 1; i <= l; i++) {
            if (i == 1 || i == l) {
                for (int j = 1; j <= b; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= b; j++) {
                    if (j == 1 || j == b) {
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
        int length = 6;
        int breadth = 20;
        display(length, breadth);
    }
}
