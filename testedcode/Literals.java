public class Literals {
    public static void main(String[] args) {
        System.out.println(0B1111); //Hex decimal called binary literal
        /*
         * Broken down: 
         *  1*2^3 (8)
         *  1 *2^2 (4)
         *  1 *2^1 (2)
         *  1 *2^0 (1)
         * 8 + 4 + 2 + 1 = 15
         */
        System.out.println(07777);
        /*
         * 07777 is a base 8 number:
         *  7 *8^3 (3584)
         *  7 *8^2 (448)
         *  7 *8^1 (56)
         *  7 *8^0 (7)
         * 3584 + 448 + 56 + 7 = 4095
         */
        System.out.println(0XFFF);
        /*
         * 0XFFFF is a base 16 number: 
         *  15 *16^3 (61440)
         *  15 *16^2 (3840)
         *  15 *16^1 (240)
         *  15 *16^0 (15)
         * 61400 + 3840 + 240 + 15 = 65535
         * 
         */
    }
}
