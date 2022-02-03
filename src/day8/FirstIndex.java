package day8;

import java.io.*;
        import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int x = Integer.parseInt(br.readLine());

        System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){

        if(arr.length==idx){
            return -1;
        }

        if(arr[idx]==x){
            return idx;
        }

        int index = firstIndex(arr, idx+1, x);


        return index;
    }

}