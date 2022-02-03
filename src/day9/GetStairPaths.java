package day9;

import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n<0){
            return new ArrayList<>();
        }

        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return  base;
        }


        ArrayList<String> a1 = getStairPaths(n-1);
        ArrayList<String> a2 = getStairPaths(n-2);
        ArrayList<String> a3 = getStairPaths(n-3);
        ArrayList<String> ans = new ArrayList<>();
        for (String s1: a1   ) {
            ans.add("1"+s1);
        }


        for (String s1: a2   ) {
            ans.add("2"+s1);
        }


        for (String s1: a3   ) {
            ans.add("3"+s1);
        }


        return ans;
    }

}