/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stp;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Stp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = new String();
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int ch = a.codePointAt(i);
            if (ch == 32) {
                b += " ";
            } else {
                b += (char) (ch + 1);
            }

        }
        System.out.println(b);
    }

}
