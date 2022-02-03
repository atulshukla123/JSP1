package day9;



import java.io.*;
import java.sql.Array;
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            return new ArrayList<>();
        }
        if(sr== dr && sc == dc){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();


        ArrayList<String> s1= getMazePaths(sr+1, sc, dr, dc);

        for (String s:
             s1) {
            ans.add("h"+ s);
        }

        ArrayList<String> s2 = getMazePaths(sr, sc+1, dr, dc);

        for (String s:
                s2) {
            ans.add("v"+ s);
        }
        return ans;
    }

}