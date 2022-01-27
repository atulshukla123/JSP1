package day1;


import java.util.*;

public class Reverse{

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();

        while(t >0){
            int x = t%10;
            t = t/10;
            System.out.println(x);
        }
    }
}