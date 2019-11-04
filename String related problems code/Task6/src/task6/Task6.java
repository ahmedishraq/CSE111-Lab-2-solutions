/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, s=0;
        String a = sc.next();
        String b = sc.next();
        String c = " ";
        String d = a.concat(c);
        String e = d.concat(b);
        System.out.println(e);
        char[] arr = e.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int ch = e.codePointAt(i);
            s += ch;
        }
        sum=s-(char)(32);
        System.out.println(sum);
    }

}
