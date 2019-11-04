import java.util.Scanner;

public class hard1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String num=sc.next();
    char [] numChar=num.toCharArray();
    int sum=0;
    for(int i=0; i<numChar.length; i++){
      sum=sum+numChar[i];
    }
    if(sum%3==0){
      System.out.println(num+" is divisible by 3");
    }else{
      System.out.println(num+" is not divisible by 3");
    }
  }
}