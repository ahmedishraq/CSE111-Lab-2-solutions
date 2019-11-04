/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task11;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        char[] arr = a.toCharArray();
        String b = "";
        for (int i = 0; i < arr.length; i++) {
            String d = "";
            int ch = a.codePointAt(i);
            if (ch > ((int) 'Z')) {
                int c = ch - ((int) 'Z');
                d += (char) ((((int) 'A') + c) + n);
            } else {
                d += ((char) (ch + n));
            }
            b += d;
        }
        System.out.println(b);
    }

}
