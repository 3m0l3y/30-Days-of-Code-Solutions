// Given a number, convert to binary, and print out how many consecutive 1's occur.
// Rather than using built in methods, I'm trying to do it manual style.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int myInt = in.nextInt();
        int consecutiveOnes = 0;
        int mod = 0;
        int answer = 0;
        int array[] = new int[8];
        int arrayPosition = 0;
        // for each bit in an array of bytes
        for(int i = 0; i < 8; i++){
            mod = myInt % 2;
            answer = myInt / 2;
            array[i] = mod;
            myInt = answer;
   
            System.out.println("mod = " + mod );
            System.out.println("answer = " + answer); 
        }   
        System.out.println(Arrays.toString(array));
        System.out.println("consecutiveOnes = " + consecutiveOnes);
    }
}
