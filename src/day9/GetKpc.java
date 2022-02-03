package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
//                     0    1   2       3   4       5       6   7   8      9
    static String[] keys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {

        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> list = getKPC(ros);
        ArrayList<String> ans = new ArrayList<>();

        for (String s:
             list) {
            ans.add(s);
        }


        for (String s:
                list) {

            int t = ch - '0';
            String s1  = keys[t];
            char c[]= s1.toCharArray();
            for (int i = 0; i <c.length ; i++) {
                ans.add(c[i]+s);
            }



        }


        return ans;
    }
}
