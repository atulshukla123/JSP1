package day6;


import java.io.*;
        import java.util.*;

public class Toggle {

    public static String toggleCase(String str){
        //write your code here

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int val = (int)arr[i];
            if(val>=65 && val <=90){
                val = val+32;
            }else{
                val = val-32;
            }

            arr[i] = (char)val;
        }

        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s+ arr[i];
        }


        return s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}