import java.util.Scanner;

public class med2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      String st=sc.next();
      char [] word=st.toCharArray();
      int [] alphbt=new int [26];
      for(int i=0; i<word.length; i++){
        int codeOfWord=(int)word[i];
        int index= codeOfWord-((int)'A');
        alphbt[index]++;
      }
      for(int i=0; i<alphbt.length; i++){
        if(alphbt[i]>1){
          System.out.println("'"+((char)(i+(int)'A'))+"'"+" was found "+alphbt[i]+" times in the word "+"'"+st+"'");
          System.out.println("Enter another word");
        }
      }
  }
}
