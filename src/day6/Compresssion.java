package day6;


import java.io.*;
        import java.util.*;

public class Compresssion {

    public static String compression1(String str){
        // write your code here


        int len = str.length();
        char[] arr = str.toCharArray();

        int cur = 0;
        int next = 1;
        int sum = 1;
        String ans = "";
        while(len-1 >0){

            if(arr[cur] == arr[next]){
                sum = sum+1;
                cur++;next++;
            }else{
                if(sum!= 1) {
                    ans = ans + arr[cur] + "" + sum;
                    cur++;
                    next++;
                }else{
                    ans = ans + arr[cur];
                    cur++;
                    next++;
                }
                sum=1;

            }
        len--;

        }

            if(sum!= 1){
                ans= ans +   arr[cur]+sum;
            }

        return ans  ;
    }

    public static String compression2(String str){
        // write your code here

        int len = str.length();
        char[] arr = str.toCharArray();

        int cur = 0;
        int next = 1;

        String ans = "";
        while(len-1 >0){
            if(arr[cur] != arr[next]){
                ans = ans + arr[cur];

            }
            cur++;next++;
            len--;

        }



        return ans +arr[cur] ;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression2(str));
        System.out.println(compression1(str));

    }

}