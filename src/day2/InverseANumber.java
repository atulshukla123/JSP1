package day2;


import java.util.*;

public class InverseANumber{

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        int answ = 0;
        int t1=1;
        while(t>0){
            int x = t%10;
            answ = (int) (answ + t1* Math.pow(10, x-1));
            t=t/10;
            t1++;
        }
        System.out.println(answ);
    }
}