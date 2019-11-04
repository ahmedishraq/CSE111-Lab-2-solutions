/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = new String();
        char[] arr = a.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            String d = new String();
            int c = 0;
            for (int i = j; i < arr.length; i++) {
                int ch = a.codePointAt(i);
                if (ch >= ((int) 'Z')) {
                    d += arr[i];
                } else if (ch <= ((int) 'Z')) {
                    d += arr[i];
                    c = i;
                    break;
                }
            }
            char[] arr1 = d.toCharArray();
            for (int k = (arr1.length - 1); k >= 0; k--) {
                b += arr1[k];
            }
            j = c;
        }
        System.out.println(b);
    }

}
