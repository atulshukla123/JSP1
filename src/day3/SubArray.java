package day3;

import java.io.*;
        import java.util.*;

public class SubArray{

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

//                for (int k = i; k <=j ; k++) {
//                    System.out.print(a[j]+"\t");
//                }
                System.out.println(i + " "+j);
            }
        }


    }

}