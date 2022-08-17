package arithematic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimesInNumbers {
    public static void main(String[] args) {

        System.out.println(factors(7775460));
    }
    public static String factors(int n){

        List<Integer> facts = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();

        for(int i= 1; i <= n; i++ ){
            if(n%i == 0){
                facts.add(i);
                if(isPrime(i)){
                    primes.add(i);
                }
            }
        }

        String result = "";


        for(int i = primes.size() - 1; i >= 0; i-- ){

            int count = 0;

            while(n % primes.get(i) == 0){
                n = n / primes.get(i);
                count++;
            }

            if(count > 1){
                result = "(" +primes.get(i)+"**"+count+")" + result;
            }else{
                result = "("+primes.get(i)+")" + result;
            }


        }



        return result;
    }

    public static boolean isPrime(Integer nn){
        if(nn == 1) return false;
        for(int i = 2; i <= Math.sqrt(nn); i++){
            if(nn % i == 0){
                return false;
            }
        }
        return true;
    }

}
