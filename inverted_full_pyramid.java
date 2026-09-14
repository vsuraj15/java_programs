/*

*********
 *******
  *****
   ***
    *

*/

class invertedFullPyramid {
    public static void main(String args[]) {
        int input = 5;
        for (int i = input; i > 0; i--) {
            for (int k = 0; k < input - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
