package day1;

import java.util.*;

public class IsPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        for (int i = 0; i <t ; i++) {
            int n= scn.nextInt();
            boolean isPrime = true;
            for (int j = 2; j < n; j++) {
                if(n%j ==0){
                    isPrime = false;
                }
            }
            System.out.println(isPrime ? "prime" : "not prime");
        }
    }
}