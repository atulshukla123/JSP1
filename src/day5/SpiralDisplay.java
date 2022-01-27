package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }




        //

        int c = 0;

        while(c<arr[0].length){
            if(c%2==0){
                for (int row = 0; row <arr.length ; row++) {
                    System.out.println(arr[row][c] + " ");
                }
            }else{
                for (int row = arr.length-1; row >=0; row--) {
                    System.out.println(arr[row][c] + " ");
                }
            }
            c++;
        }


    }
}
