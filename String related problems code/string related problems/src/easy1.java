import java.util.Scanner;

public class easy1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String st=sc.next();
    char [] word=st.toCharArray();
    int [] code=new int [word.length];
    for(int i=0; i<word.length; i++){
      int k=(int)word[i];
      code[i]=k;
    }
    
    for(int i=0; i<code.length; i++){
      for(int j=0; j<(code.length-1); j++){
        if(code[j]>code[j+1]){
          int temp = code[j];
          code[j]=code[j+1];
          code[j+1]=temp;
        }
      }
    }
    for(int i=0; i<code.length; i++){
      System.out.print((char)code[i]);
    }
    System.out.println();
  }
}