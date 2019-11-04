import java.util.Scanner;

public class hard3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=sc.next();
    char [] wordChar=word.toCharArray();
    String outp="";
    for(int j=0; j<wordChar.length; j++){
      String rgh="";
      int c=0;;
      for(int i=j; i<wordChar.length; i++){
       if(((int)wordChar[i])>=((int)'Z')){
         rgh=rgh+wordChar[i];
       }else if(((int)wordChar[i])<=((int)'Z')){
         rgh=rgh+wordChar[i];
         c=i;
         break;
       }
     }
     char [] rghChar=rgh.toCharArray();
     for(int k=(rghChar.length-1); k>=0; k--){
       outp=outp+rghChar[k];
     }
     j=c;
    }
    System.out.println(outp);
  }
}