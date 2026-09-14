/*

    *
   ***
  *****
 *******
*********

 */

class fullPyramid {
    public static void main(String args[]) {
        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int k = 1; k <= input - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
