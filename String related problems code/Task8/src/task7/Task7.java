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
        int sum = 0;
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 == 0) {
            System.out.println(a + " is divisible by 3");
        }
    }

}
