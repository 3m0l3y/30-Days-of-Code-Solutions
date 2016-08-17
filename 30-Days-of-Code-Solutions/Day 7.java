import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        int count = arr.length;
        for (int i : arr){
            count = count -1;
            System.out.print(arr[count] + " ");
        }
        
    }
}