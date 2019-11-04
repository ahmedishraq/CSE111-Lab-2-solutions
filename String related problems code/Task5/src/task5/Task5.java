/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        int[] arr1 = new int[26];
        for (int i = 0; i < arr.length; i++) {
            int ch = a.codePointAt(i);
            if (ch >= 65 && ch <= 90) {
                int index = ch - ((int) 'A');
                arr1[index]++;
            } else {
                int in = ch - ((int) 'a');
                arr1[in]++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 1) {
                c++;
                System.out.println("'" + ((char) (i + (int) 'A')) + "'" + " was found " + arr1[i] + " times in the word " + "'" + a + "'");
                System.out.println("Enter another word");
            }
        }
        if (c < 1) {
            System.out.println("You entered " + a);
        }
    }
}
