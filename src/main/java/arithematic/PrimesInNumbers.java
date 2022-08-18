package arithematic;

public class PrimesInNumbers {
    public static void main(String[] args) {

        System.out.println(factors(7919));
    }
    public static String factors(int n){

        StringBuilder sb = new StringBuilder();
        int curr = n;
        for(int i= 2; i <= curr; i++ ){
        int mulitiples = 0;
                while(curr % i == 0){
                    ++mulitiples;

                    curr = curr / i;
                }

            if(mulitiples > 1){
                sb.append("(").append(i).append("**").append(mulitiples).append(")");
            }else if(mulitiples == 1){
                sb.append("(").append(i).append(")");
            }

        }

        return sb.toString();
    }



}
