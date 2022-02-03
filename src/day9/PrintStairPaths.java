package day9;

import java.io.*;
import java.util.*;

public class PrintStairPaths {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {

        //base case

        if(n<0){
            return;
        }

        if(n==0){
            System.out.println(path);
            return;
        }

        printStairPaths(n-1, "1"+path);
        printStairPaths(n-2, "2"+path);
        printStairPaths(n-3, "3"+path);
    }

}