package contest;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int t = get(n);
        System.out.println(t);

    }

//    static
    static int get(int n){
        int  sum=0;
        if(n==0){
            return 0;
        }

        int x = n%10;
        if(x%2 !=0){
            sum = sum+ n%10 + get(n/10);
        }else{
            get(n/10);
        }

        return sum;

    }

}