package day6;


import java.io.*;
        import java.util.*;

public class RemoveAllPrime {
// 2 3 4 5 6
    public static void solution(ArrayList<Integer> al){
        // write your code here

        for (int i = al.size()-1; i >=0 ; i--) {
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }
    }

    static boolean isPrime(int number){
        for (int i = 2; i*i <number ; i++) {
                if(number%i == 0){
                    return  true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

}