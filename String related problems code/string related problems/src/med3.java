import java.util.Scanner;

public class med3{
  public static void main(String[] args){
    Scanner meow=new Scanner(System.in);
    String word1=meow.next();
    String word2=meow.next();
    String outp=word1.concat(" "+word2);
    System.out.println(outp);
    char [] word=outp.toCharArray();
    int sum=0;
    for(int i=0; i<word.length; i++){
      sum=sum+((int)word[i]);
    }
    System.out.println(sum-((int)' '));
  }
}