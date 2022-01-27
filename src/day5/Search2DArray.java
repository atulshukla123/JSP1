package day5;

import java.io.*;
import java.util.*;

public class Search2DArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int numberFound = scn.nextInt();
        int x = 0, y =N-1;
        while (x <arr.length  && y >=0 ){
            if(numberFound == arr[x][y]){
                System.out.println(x);
                System.out.println(y);
                return;
            }else if(numberFound > arr[x][y]){
                x = x+1;
            }else{
                y = y-1;
            }
        }
        System.out.println("Not Found");
    }

}