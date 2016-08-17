import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int newN;
        for(int i = 1; i < 11; i++){
            newN = N * i;
            System.out.println(N + " x " + i + " = " + newN );
        }
    }
}
