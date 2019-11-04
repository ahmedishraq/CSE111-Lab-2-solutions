import java.util.Scanner;

public class easy3{
  public static void main(String[] args){
    Scanner meow = new Scanner(System.in);
    String inp=meow.next();
    char [] word=inp.toCharArray();
    int [] code=new int [word.length];
    for(int i=0; i<word.length; i++){
      int k=(int)word[i];
      code[i]=k-1;
    }
    for(int i=0; i<code.length; i++){
      System.out.print((char)code[i]);
    }
    System.out.println();
  }
}