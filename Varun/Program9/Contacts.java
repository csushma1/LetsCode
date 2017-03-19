import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Node{
        public HashMap<Character,Node> node= new HashMap<>();
        public int numberOfLetters=0; // keeps track of number of names that has this value.
        public void childAdder(Character ch)
            {
            node.put(ch,new Node());
        }
    }
    static Node MainStorage= new Node();
    static void add(String input){
        Character inputChar;
        Node parser=MainStorage;
        for(int i=0;i<input.length();i++){
            inputChar=input.charAt(i);
            if(! parser.node.containsKey(inputChar)){
                parser.childAdder(inputChar);
            }


                parser=parser.node.get(inputChar);
                parser.numberOfLetters++;
            }


    }
    static void find(String input){
        Character inputChar;
        Node parser=MainStorage;
        boolean flag=true;
        for(int i=0;i<input.length();i++){
            inputChar=input.charAt(i);
            if(parser.node.containsKey(inputChar)){
                parser=parser.node.get(inputChar);
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(parser.numberOfLetters);
        }
        else{
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String query,input;
        int numberOfInputs;
        Scanner scan=new Scanner(System.in);
        numberOfInputs=scan.nextInt();
        for(int i=0;i<numberOfInputs;i++){
        query=scan.next();
        if(query.equals("add")){
            input=scan.next();
            add(input);
            }
        if(query.equals("find")){
            input=scan.next();
            find(input);
            }
        }

    }
}
