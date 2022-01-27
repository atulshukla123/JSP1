package day3;

import java.io.*;
import java.util.*;

public class RotateArray{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    // 1 2 3 4 5 3

    public static void rotate(int[] a, int k){
        // write your code here
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);
    }

    static void reverse(int[] a, int l, int r){



        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r]= temp;
            l++;
            r--;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

       k = k% a.length;

        if(k<0){
            k = k+ a.length;
        }
        rotate(a, k);
        display(a);
    }

}