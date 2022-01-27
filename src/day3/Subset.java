package day3;


import java.io.*;
        import java.util.*;

public class Subset{

    public static void main(String[] args) throws Exception {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int k= (int)Math.pow(2, n);
        String ans = "";
        for (int i = 0; i < k-1; i++) {

            int temp = i;
            ans = "";
            for (int j = n-1; j >= 0; j--) {


                if(temp%2== 0){
                    ans= "-"+"\t"+ans;
                }else{
                    ans= a[j]+ "\t" +ans ;
                }

                temp= temp/2;

            }

            System.out.println(ans);

        }

    }

}