// ***THIS TEXT ISNT WORKING YET***
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
        int moded = 0;
        int answer = 0;
        int consecutiveOnes = 0;
        int arrayPosition = 0;
        int array[] = new int[8];
        // For each bit in an array of bits
        for(int i = 0; i < 8; i++){
            moded = myInt % 2;
            answer = myInt / 2;
            if((moded == 1) && (answer >= 1)){
                array[i] = 1;
                arrayPosition = i + 1;
                array[arrayPosition] = 1;
                consecutiveOnes++;
                break;
            }
            else if((moded == 1) && (answer >= 2)){
                array[i] = 1;
                arrayPosition = i - 1;
                if((arrayPosition > -1) && (array[arrayPosition] == 1)){
                    consecutiveOnes++;
                }
            }
            else {
                array[i] = 0;            
           }
            myInt = answer;
        }
       System.out.println(Arrays.toString(array));
       System.out.println("Number of consecutiveOnes: " + consecutiveOnes );
    }
}
