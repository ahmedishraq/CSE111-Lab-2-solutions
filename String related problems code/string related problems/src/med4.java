import java.util.Scanner;

public class med4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      String inp=sc.next();
      char [] word=inp.toCharArray();
      int [] alphbt=new int [26];
      for(int i=0; i<word.length; i++){
        int codeOfWord=(int)word[i];
        int index= codeOfWord-((int)'A');
        alphbt[index]++;
      }
      for(int i=0; i<alphbt.length; i++){
        if(alphbt[i]>1){
          System.out.print(((char)(i+(int)'A')));
        }
      }
      System.out.println();
  }
}