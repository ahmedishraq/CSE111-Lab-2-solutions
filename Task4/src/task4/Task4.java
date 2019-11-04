/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] alphabetArray = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int value = (int) ch;
            if (value >= 65 && value <= 90) {
                alphabetArray[ch - 'A']++;
            }
        }
        for (int i = 0; i < alphabetArray.length; i++) {
            char ch = (char) (i + 65);
             int value = (int) ch;
            System.out.println(ch + " Which is " +value +" was found " + alphabetArray[i] + " times");
        }
    }

}
