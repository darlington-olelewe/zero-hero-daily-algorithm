package arrayManipulation;

import java.util.Arrays;
/**
 *Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements,
 * with the same multiplicities (the multiplicity of a member is the number of times it appears).
 * "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 *
 * Examples
 * Valid arrays
 *
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 *
 * comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361
 * the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:
 *
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 *
 * Invalid arrays
 * If, for example, we change the first number to something else, comp is not returning true anymore:
 *
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
 *
 * comp(c,d) returns false because in b 132 is not the square of any number of a
 */


public class AreSame {

    public static void main(String[] args) {
        // -- For Valid --
       int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
       int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a,b));

        // -- For Invalid --

        int[] c = new int[] {121, 144, 19, 161, 19, 144, 19, 11};
        int[] d = new int[] {132, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(c,d));

    }

    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null) return false;
        if(a.length != b.length) return false;
        int[] newA = Arrays.stream(Arrays.stream(a).map(e -> e*e).toArray()).sorted().toArray();
        int[] newB = Arrays.stream(b).sorted().toArray();

        for(int i = 0; i < newB.length; i++){
            if(newA[i] != newB[i]) return false;
        }

        return true;
    }
}
