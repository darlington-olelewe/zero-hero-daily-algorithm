package googleKickStart;

public class EvenDigits {

    public static void main(String[] args) {

    }


    static int calculator(int num){
      String numString = String.valueOf(num);
      //int length = numString.length();

      for(int i = 0; i < numString.length(); i++){
          char[] chars = numString.toCharArray();

          int current = Integer.parseInt(""+chars[i]);
          if(current % 2 != 0) {

          }
      }
        //not completed yet
        return 1;
    }



}

//3090
