/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char temp;
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr);
    }
}
/* import java.util.Arrays;
    Scanner sc = new Scanner (System.in);
    String a=sc.nextLine();
    char [] arr=a.toCharArray();
    Arrays.sort(arr);
    String b= new String (arr);
    System.out.println(b);
*/
