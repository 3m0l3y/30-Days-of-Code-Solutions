// Given a number, convert to binary, and print out the number of consecutive ones.
// This script was pulled from the Discussion Board because the solutions proposed by this exercise are incorrect.
// The example given says input of 5 should output 1, but there are no consecutive 1's in the binary representation of 5.
// Based on the assumption that consecutive 1's means a number 1 immediately followed by a number 1.
// See my commented script below for an accurate representation of binary when given a number (n);
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
    
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int rem=0,s=0,t=0;


    while(n>0)
        {
        rem=n%2;
        n=n/2;
        if(rem==1)
         {   s++;
           if(s>=t)

            t=s;

        }
        else{

            s=0;
        }   
    }

    System.out.println(t);
}
}
/*
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
    }
}
*/