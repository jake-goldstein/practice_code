import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void leftRotatePrint(int[] a, int rotates){
        rotates = rotates % a.length;

        for (int i = rotates; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < rotates; i++){
            System.out.print(a[i] + " ");
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();

        leftRotatePrint(a, d);
    }
}
