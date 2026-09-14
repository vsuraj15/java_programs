/*

*
**
***
****
*****
******
*****
****
***
**
*

*/

class halfDiamondStar {
    public static void main(String args[]) {
        int input = 6;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = input - 1; k > 0; k--) {
            for (int l = k; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
