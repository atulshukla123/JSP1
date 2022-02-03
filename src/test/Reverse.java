package test;

public class Reverse {
}
class Solution {

    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};

        reverseString(s);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
    public static void reverseString(char[] s) {

        int low = 0;
        int high = s.length-1;

        while(low< high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }
        //return s;

    }
}