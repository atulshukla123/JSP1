package day5;

import java.util.Scanner;

public class SaddlePoint {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(find(arr, i,j, N)){
                    System.out.println(arr[i][j]);
                }

            }
        }
    }

    static boolean find(int arr[][], int row, int col, int N){

        int i1 =-1,j1 =-1;
        int maxRow = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if(arr[row][i] < maxRow){
                i1= row;
                j1= col;
                maxRow = arr[row][i];
            }
        }

        int i2 =-1,j2 =-1;
        int minCol = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if(arr[i][col] > minCol){
                i2= row;
                j2= col;
                minCol = arr[i][col];
            }
        }

        if(i1==i2 && j1==j2){
            return true;
        }



        return false;

    }
}
