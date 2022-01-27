package contest;

import java.io.*;
        import java.util.*;

public class CharPrint{

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int cnt = 1;
        int K = 65;
        for (int i = 1; i <= n; i++) {

            if(i==1){
                System.out.print((char)K );
                System.out.println();
                K++;
                continue;
            }
            System.out.print((char)K );
            for (int j = 1; j <cnt ; j++) {
                System.out.print("*");

            }
            cnt++;
            System.out.print((char)K );
            K++;
            System.out.println();
        }

    }

}