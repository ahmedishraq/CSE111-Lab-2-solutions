
import java.util.Scanner;

public class hard4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String word = sc.next();
        char[] wordChar = word.toCharArray();
        String outp = "";
        for (int i = 0; i < wordChar.length; i++) {
            String res = "";
            int code = (int) wordChar[i];
            if (code > ((int) 'Z')) {
                int newNum = code - ((int) 'Z');
                res = res + (char) ((((int) 'A') + newNum) + num);
            } else {
                res = res + ((char) (code + num));
            }
            outp = outp + res;
        }
        System.out.println(outp);
    }
}
