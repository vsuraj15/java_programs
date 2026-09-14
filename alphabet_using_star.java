/*

 ****
*    *
*    *
*    *
*    *
******
*    *
*    *
*    *
*    *

*/

class albhabetUsingStar {
    public static void main(String args[]) {
        int input = 5;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= input / 2; j++) {
                if (i == 0 || j == 0 || j == input / 2 || i == input / 2) {
                    if (i == 0 && (j == 0 || j == input / 2)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
