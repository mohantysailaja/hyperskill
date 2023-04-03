public class booleanvalue {
    public static void main(String[] args){
        boolean open = true;
        boolean closed = false;

        System.out.println(open);   // true
        System.out.println(closed); // false
//What expressions return true if b1 is true and b2 is false?b1 ^ b2 and b1 || b2
        //hints:About ^ (XOR):
        //The XOR logical operation, or exclusive or, takes two boolean operands and returns true if and only if the operands are different.
        //Thus, it returns false if the two operands have the same value.
        boolean b1 = false && false; // false
        boolean b2 = false && true;  // false
        boolean b3 = true && false;  // false
        boolean b4 = true && true;   // true
        boolean b11 = false || false; // false
        boolean b21 = false || true;  // true
        boolean b31 = true || false;  // true
        boolean b41 = true || true;   // true
        boolean b12 = false ^ false; // false
        boolean b22 = false ^ true;  // true
        boolean b32 = true ^ false;  // true
        boolean b42 = true ^ true;   // false

       // below expression result:false
        boolean b13 = false;
        boolean b23 = true;
        boolean b33 = false;
        System.out.println(b13 && b23 || b33);
        //result :hints:Bitwise XOR (exclusive or) "^" is an operator in Java that provides the answer '1'
        // if both of the bits in its operands are different, if both of the bits are same then the XOR operator gives the result '0'.
        boolean b14 = false;
        boolean b24 = true;
        System.out.println(b14 ^ b24);//true
        //example,hints:OR is a binary operator that returns true if at least one operand is true, otherwise, it returns false. It is denoted as ||.
        boolean b15 = true;
        boolean b25 = false;
        boolean b35 = true;
        boolean b45 = false;
        System.out.println(b15 && (b25 || (b35 || b45)));//true
        //https://hyperskill.org/learn/step/2686  De Morgan's laws
        boolean b16 = true;
        boolean b26 = false;
        //D Morgan's Law//https://web.stanford.edu/class/cs103/tools/truth-table-tool/
        System.out.println(!b16 && !b26);
        System.out.println(!b16 || b26);
        System.out.println(b16 || !!b26);
        System.out.println(!b16 && b26);
        System.out.println(!(b16 || b26));

        //hints:Remember that the AND operator will not evaluate the second parameter if the first provided parameter is false.
         boolean b92 = true;
         boolean b93 = false;
         System.out.println(!b92 && (b93 || b92));
//example
        int number = 990;
        boolean result = number > 1000 || number % 10 == 0;
        System.out.println(result);//true
    }
}
