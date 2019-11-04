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
public class Task7b {

    public static void main(String[] args) {
        String str1 = "Strings are ostheer";
        String str2 = "Strings are ostheer";
        String str3 = "Strings are not ostheer";

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
    }
}
