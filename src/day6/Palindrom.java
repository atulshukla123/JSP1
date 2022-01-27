package day6;

    import java.io.*;
import java.util.*;

public class Palindrom {

    public static void solution(String str){
        //write your code here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <str.length() ; j++) {
                if(isPalindrom(str.substring(i, j+1))){
                    System.out.println(str.substring(i, j+1));
                }
            }
        }
    }

    static boolean isPalindrom(String str){

        char[] arr = str.toCharArray();
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            if(arr[low]!= arr[high]){
                return  false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}