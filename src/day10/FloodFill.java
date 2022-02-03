package day10;

import java.io.*;
import java.util.*;

public class FloodFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    // asf -> answer so far




    public static void floodfill(int[][] maze, int sr, int sc, String psf) {
        if(sr > maze.length-1 || sr < 0 ||  sc > maze[0].length-1 ||  sc < 0){
            return;
        }
        if(sr == maze.length-1 && sc == maze[0].length-1){
            System.out.println(psf);
            return;
        }
        floodfill(maze, sr, sc+1, psf+"r");
        floodfill(maze, sr+1, sc, psf+"l");
        floodfill(maze, sr, sc-1, psf+"d");
        floodfill(maze, sr+1, sc, psf+"t");


    }
}
