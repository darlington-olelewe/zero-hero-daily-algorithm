package stringManipulation;

public class ShortestWord {
    public static void main(String[] args) {

    }
    public static int findShort(String s) {

        int shortest = Integer.MAX_VALUE;
        String[] strArr = s.split(" ");
        for(String word: strArr) {
            shortest = Math.min(shortest,word.length());
        }
        return shortest;
    }


}
