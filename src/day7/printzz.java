package day7;

import java.io.*;
import java.util.*;

public class printzz {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        pzz(x);
    }

    public static void pzz(int n) {
        if(n<=0) {
            return;
        }
        System.out.println("Pre: " +n);
        pzz(n-1);
        System.out.println("In: " +n);
        pzz(n-2);
        System.out.println("Post: " +n);

    }

}