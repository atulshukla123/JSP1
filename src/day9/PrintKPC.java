package day9;

import java.util.Scanner;

public class PrintKPC {
    static String[] keys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str, "");
    }

    public static void printKPC(String str, String asf) {


        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        char val = str.charAt(0);
        String ros = str.substring(1);

        int t = val - '0';
        String s1  = keys[t];
        char c[]= s1.toCharArray();
        for (int i = 0; i <c.length ; i++) {
//            ans.add(c[i]+s);

            printKPC(ros, asf+c[i]);
        }


    }
}
