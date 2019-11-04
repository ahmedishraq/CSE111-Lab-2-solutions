/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team = sc.next();
        String coach = sc.next();
        char[] teamChar = team.toCharArray();
        char[] coachChar = coach.toCharArray();
        int[] teamAlphbt = new int[26];
        int[] coachAlphbt = new int[26];

        for (int i = 0; i < teamChar.length; i++) {
            int codeOfTeam = (int) teamChar[i];
            int index = codeOfTeam - ((int) 'A');
            teamAlphbt[index]++;
        }
        int sumOfTeam = 1;
        for (int i = 0; i < teamAlphbt.length; i++) {
            if (teamAlphbt[i] > 0) {
                sumOfTeam = sumOfTeam * (i + 1);
            }
        }

        for (int i = 0; i < coachChar.length; i++) {
            int codeOfCoach = (int) coachChar[i];
            int index = codeOfCoach - ((int) 'A');
            coachAlphbt[index]++;
        }
        int sumOfCoach = 1;
        for (int i = 0; i < coachAlphbt.length; i++) {
            if (coachAlphbt[i] > 0) {
                sumOfCoach = sumOfCoach * (i + 1);
            }
        }
        if ((sumOfTeam % 14) < (sumOfCoach % 14)) {
            System.out.println("I Am Happy With My Coach");
        } else {
            System.out.println("I Am Sad With My Coach");
        }
    }

}
