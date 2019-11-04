import java.util.Scanner;

public class med1{
  public static void main(String[] args){
    Scanner meow = new Scanner(System.in);
    String inp=meow.next();
    char [] word=inp.toCharArray();
    for(int i=0; i<word.length; i++){
      for(int j=0; j<=i; j++){
        System.out.print(word[j]);
      }
      System.out.println();
    }
  }
}