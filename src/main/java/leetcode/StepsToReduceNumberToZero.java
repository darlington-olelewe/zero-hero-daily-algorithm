package leetcode;

public class StepsToReduceNumberToZero {

    public static void main(String[] args) {
        int result = numberOfSteps(14);
        System.out.println(result); //6
    }

    static int numberOfSteps(int num) {

        int count = 0;

        while(num != 0){
            count++;
            if(num % 2 == 0){
                num /=2;
            }else {
                num -= 1;
            }
        }

        return count;

    }
}
