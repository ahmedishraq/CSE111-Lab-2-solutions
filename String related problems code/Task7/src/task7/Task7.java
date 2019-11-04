/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        int[] arr1 = new int[26];
        for (int i = 0; i < arr.length; i++) {
            int ch = a.codePointAt(i);
            int index = ch - ((int) 'A');
            arr1[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] > 1) {
                System.out.print(((char) (i + (int) 'A')));
            }
        }
        System.out.println("");
    }

}
