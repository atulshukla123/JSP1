package day9;

import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {

        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        char val = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros, ans+val);
        printSS(ros, ans);




    }

}