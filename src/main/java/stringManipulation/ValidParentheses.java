package stringManipulation;

import java.util.Stack;

public class ValidParentheses {

    //Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
    // The function should return true if the string is valid, and false if it's invalid.
    //
    //Examples
    //"()"              =>  true
    //")(()))"          =>  false
    //"("               =>  false
    //"(())((()())())"  =>  true
    //Constraints
    //0 <= input.length <= 100
    //
    //Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
    // Furthermore, the input string may be empty and/or not contain any parentheses at all.
    // Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).

    public static void main(String[] args) {
        System.out.println(validParentheses("()")); //true
        System.out.println(validParentheses("())")); //false
        System.out.println(validParentheses2("())")); //false
        System.out.println(validParentheses("32423(sgsdg)")); //true
        System.out.println(validParentheses("(dsgdsg))2432")); //false
        System.out.println(validParentheses("adasdasfa")); //true
        System.out.println(validParentheses2("adasdasfa")); //true
        System.out.println(validParentheses("ZO))))")); //false
        System.out.println(validParentheses("7)(>A()zj|AN))(<U8l)")); //false


        System.out.println("\n\n Second Section \n\n");

        System.out.println(validParenthesis("()")); //true
        System.out.println(validParenthesis("())")); //false
        System.out.println(validParenthesis("())")); //false
        System.out.println(validParenthesis("32423(sgsdg)")); //true
        System.out.println(validParenthesis("(dsgdsg))2432")); //false
        System.out.println(validParenthesis("adasdasfa")); //true
        System.out.println(validParenthesis("adasdasfa")); //true
        System.out.println(validParenthesis("ZO))))")); //false
        System.out.println(validParenthesis("7)(>A()zj|AN))(<U8l)")); //false

    }

    public static boolean validParentheses(String parens)
    {
        //Put code below
        String[] parensArr = parens.split("");
        int count = 0;
        int open = 0;
        for(int i = 0;  i<parensArr.length; i++){
            if(parensArr[i].equals("(")){
                count++;
                open++;
            }
            if(parensArr[i].equals(")")){
                count++;
            }
        }
        if(count%2 != 0){
            return false;
        }
        return count/2 == open;
    }

    public static boolean validParentheses2(String parens) {
        //Put code below
        int count = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                count++;
            }
            if (parens.charAt(i) == ')') {
                count--;
            }
        }
        return count == 0;
    }


    public static boolean validParenthesis(String parens){
        char[] charSequence = parens.toCharArray();
        Stack<Character> charList = new Stack<>();
        getBrackets(charList,charSequence);
        return charList.size() == 0;
    }

    static void getBrackets(Stack<Character> charList, char[] chars){
        for(char e: chars){
            if(isBracket(e)){

                if(charList.isEmpty()){
                    charList.add(e);
                }else if(charList.peek() == '(' && e == ')'){
                    charList.pop();
                }else{
                    charList.add(e);
                }
            }
        }
    }
    public static boolean isBracket(char c){
        if(c == '(' || c == ')') return true;
        return false;
    }


}
