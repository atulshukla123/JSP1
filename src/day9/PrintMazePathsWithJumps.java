package day9;

import java.io.*;
import java.util.*;

public class PrintMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1 , "");
//        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr > dr || sc > dc){
            return;
        }
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        printMazePaths(sr, sc+1, dr, dc , "v"+psf);
        printMazePaths(sr+1, sc, dr, dc , "h"+psf);


    }

}