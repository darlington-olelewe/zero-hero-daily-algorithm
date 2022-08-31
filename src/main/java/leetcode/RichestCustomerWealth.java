package leetcode;

public class RichestCustomerWealth {

     static int maximumWealth(int[][] accounts) {

        int weathiest = Integer.MIN_VALUE;

        for(int i = 0; i < accounts.length; i++){
            int temp = customerWealth(accounts[i]);
            if(temp > weathiest) weathiest = temp;
        }

        return weathiest;
    }

    static int customerWealth(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int[][] bankCustomers = new int[][]{{1,2,3}, {2,3,4}};

        int result = maximumWealth(bankCustomers);

        System.out.println(result); //9
    }
}
