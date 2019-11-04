import java.util.Scanner;

public class easy2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String st=sc.next();
    char [] word=st.toCharArray();
    int [] code=new int [word.length];
    for(int i=0; i<word.length; i++){
      int k=(int)word[i];
      code[i]=k+1;
    }
    for(int i=0; i<code.length; i++){
      System.out.print((char)code[i]);
    }
    System.out.println();
  }
}