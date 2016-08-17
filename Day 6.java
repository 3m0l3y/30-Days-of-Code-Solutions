import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
   
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numArgs = scanner.nextInt();
        for(int i = 0; i < numArgs; i++){
           String myStringEven = "";
           String myStringOdd = "";
           String grandString = "";
           String string = scanner.next();
           char[] myCharArray = string.toCharArray();
           for(int j = 0; j < string.length(); j++){
                if (j % 2 == 0){
                   myStringEven += myCharArray[j];
                }
                else myStringOdd += myCharArray[j];
                grandString = myStringEven + " " + myStringOdd + "\r\n";
           }       
            System.out.print(grandString);
       }
    }
}