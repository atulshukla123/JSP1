package day9;

import java.io.*;
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> list =  gss(str);

        for (String s:
             list) {
                System.out.println(s);
        }

    }
// "" c b bc a ac ab abc
    public static ArrayList<String> gss(String str) {

        if(str.length() ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        //
        char dd = str.charAt(0);
        ArrayList<String> ll = gss(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();

        for (String sa:   ll ) {
                    ans.add(sa);
        }

        for (String sa:   ll ) {
            ans.add(dd+sa);
        }

        return ans;
    }

}