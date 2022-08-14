package googleKickStart;

public class EvenDigits {

    public static void main(String[] args) {

        System.out.println(calculator(2018));

        System.out.println(Integer.parseInt("01"));
        System.out.println("01".substring(1,1));

    }


    static int calculator(int num){
      boolean isEven = checkEveness(num);
      if(isEven) return 0;




      int result = 0;
      String numString = String.valueOf(num);
      int lastVal = Integer.parseInt(""+numString.charAt(numString.length() - 1));
      if(lastVal > 5){
          result = doPlus(numString);
      }else{
          result = doMinus(numString);
      }



        //not completed yet
        return result;
    }

    static boolean checkEveness(int num){
        String numString = String.valueOf(num);

        for(int i = 0; i < numString.length(); i++){
            int each = Integer.parseInt(String.valueOf((char)numString.charAt(i)));
            if (each % 2 != 0) return false;
        }

        return true;
    }

    static int doPlus(String numString){
        int score = 0;
        for(int i=0; i < numString.length(); i++){
            int curr = Integer.parseInt(""+numString.charAt(i));
            if(!checkEveness(curr)){
                score += (1 * Integer.parseInt(1+ "0".repeat(numString.length() - i)));

            }

        }
        return score;
    }

    static int doMinus(String numString){
        int score = 0;
        for(int i=0; i < numString.length(); i++){
            int curr = Integer.parseInt(""+numString.charAt(i));
            if(!checkEveness(curr) && (i < numString.length() - 1)){
                score -= (1 * Integer.parseInt(1+ "0".repeat(numString.length() - i)));
            }

            if(i == numString.length() - 1){
                score -= curr;

            }
        }
        return score;
    }


    static String[] handleLastTwoDigits(String digits){

        int num = Integer.parseInt(digits);
        if(digits.substring(0,1) == "0"){
            int value = Integer.parseInt( digits.substring(1,1));

            int val = 11 - value;
        }
        return new String[]{};
    }



}

//3090
