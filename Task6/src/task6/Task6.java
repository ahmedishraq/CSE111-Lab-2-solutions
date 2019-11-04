/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;

public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String c = " ==THE END== ";
        System.out.println(b);
        String d = b.concat(c);
        System.out.println(d);
        System.out.println(b);
    }

}
