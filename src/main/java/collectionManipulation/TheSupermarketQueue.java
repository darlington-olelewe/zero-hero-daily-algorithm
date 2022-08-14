package collectionManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *DESCRIPTION:
 * There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!
 *
 * input
 * customers: an array of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
 * n: a positive integer, the number of checkout tills.
 * output
 * The function should return an integer, the total time required.
 *
 * Examples
 * queueTime([5,3,4], 1)
 * // should return 12
 * // because when there is 1 till, the total time is just the sum of the times
 *
 * queueTime([10,2,3,3], 2)
 * // should return 10
 * // because here n=2 and the 2nd, 3rd, and 4th people in the
 * // queue finish before the 1st person has finished.
 *
 * queueTime([2,3,10], 2)
 * // should return 12
 */


public class TheSupermarketQueue {

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));//9
        System.out.println(solveSuperMarketQueue(new int[] { 2, 3,10 }, 2));//12
        System.out.println(solveSuperMarketQueue(new int[] { 5,3,4 }, 1));//12
        System.out.println(solveSuperMarketQueue2(new int[] { 5,3,4 }, 1));//12
        System.out.println(solveSuperMarketQueue(new int[] { 10,2,3,3 }, 2)); //10
        System.out.println(solveSuperMarketQueue2(new int[] { 10,2,3,3 }, 2)); //10
    }



    public static int solveSuperMarketQueue(int[] customer, int n){
        List<Integer> jobQueues = new ArrayList<>();

        for(int i = 0; i < customer.length; i++){

            if(i < n){
                jobQueues.add(customer[i]);
            }else{
                goToLeastQueue(jobQueues,customer[i]);
            }
        }

        return jobQueues.stream().mapToInt(e->e).max().orElse(0);

    }

    static void goToLeastQueue(List<Integer> queue, int customer){
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < queue.size(); i++){
            if(queue.get(i) < min){
                min = queue.get(i);
                minIndex = i;
            }
        }
        queue.set(minIndex, queue.get(minIndex) + customer);

    }


    public static int solveSuperMarketQueue2(int[] customers, int n) {
        //n = number of queues
        int[] total = new int[n];
        //loop through customers, add values to first index of total
        //then sort, this makes sure that the smallest value is at index 0 for n>1
        //then return the largest value
        for(int i = 0; i < customers.length; i++){
            total[0] += customers[i];
            Arrays.sort(total);
        }
        return total[n-1];
    }
}
