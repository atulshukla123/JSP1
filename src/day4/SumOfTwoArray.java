package day4;


import java.io.*;
        import java.util.*;

public class SumOfTwoArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = Integer.parseInt(br.readLine());
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = Integer.parseInt(br.readLine());
        }

        int h = a1.length>a2.length?a1.length : a2.length;

        int sum = 0;
        while(h>0){



        }





    }
}