package multiplesAndFactors;

/**
 * You might know some pretty large perfect squares. But what about the NEXT one?
 *
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
 * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
 *
 * Examples:(Input --> Output)
 *
 * 121 --> 144
 * 625 --> 676
 * 114 --> -1 since 114 is not a perfect square
 */


public class FindTheNextPerfectSquare {

    public static void main(String[] args) {

        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare2(121));
    }

    public static long findNextSquare(long sq) {
        long num = (long)Math.sqrt(sq);
        if(num * num != sq) return -1;
        ++num;
        return (long)Math.pow(num,2) ;
    }

    public static long findNextSquare2(long sq) {
        double root =   Math.sqrt(sq);
        if(root%1 != 0) return -1;
        return (long)Math.pow(root +1, 2);
    }
}

//a number of possible ways to check if a number is an integer

//double x == 2.12;
//
//    if(Math.floor(x) != x){
//        System.out.println("not an integer");
//    } else{
//        System.out.println("not an integer");
//    }


//if((x%1)!=0)
//    {
//        System.out.println("not a integer");
//    }
//    else
//    {
//        System.out.println("integer");
//    }

//if (x != (int)x)
//{
//   System.out.println("not a integer");

