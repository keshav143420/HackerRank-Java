import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ttc = sc.nextInt();
        int a,b,n,res;
        for (int tc = 1; tc <= ttc; tc++){
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            res = 0;
            for (int i = 0; i < n; i++){
                res += Math.pow(2,i) * b;
                System.out.print((res + a) + " ");
            }
            System.out.println();
        }
    }
}