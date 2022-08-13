package stringManipulation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Pirates have notorious difficulty with enunciating. They tend to blur all the letters together and scream at people.
 *
 * At long last, we need a way to unscramble what these pirates are saying.
 *
 * Write a function that will accept a jumble of letters as well as a dictionary, and output a list of words that the pirate might have meant.
 *
 * For example:
 * grabscrab( "ortsp", ["sport", "parrot", "ports", "matey"] )
 * Should return ["sport", "ports"].
 *
 * Return matches in the same order as in the dictionary. Return an empty array if there are no matches.
 */


public class ArrhGrabscrab {

    public static void main(String[] args) {

        List<String> result = grabscrab("oob", List.of("bob","baobab"));
        List<String> result2 = grabscrab("ainstuomn", List.of("mountains", "hills", "mesa"));
        List<String> result3 = grabscrab("ortsp", List.of("parrot","sport","ports", "matey"));
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }



    public static List<String> grabscrab(String s, List<String> words){
        List<String> possibilites = new ArrayList<>();
        String expected = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        for(int i = 0; i < words.size(); i++){
            String temp = Arrays.stream(words.get(i).split("")).sorted().collect(Collectors.joining());
            if(temp.contains(expected))possibilites.add(words.get(i));
        }
        return possibilites.size() > 0 ? possibilites : new ArrayList<String>();
    }
}
