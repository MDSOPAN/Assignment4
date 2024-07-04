import java.util.Scanner;
public class Task10{
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int n_copy= n;
    int count = 0;
    while(true){
      n=n/10;
      count++;
      if(n==0){
        break;
      }
    }
    for(int i=count-1;i>0;i--){
      System.out.print((int)(n_copy/(Math.pow(10,i))) + ",");
      n_copy=n_copy%(int)(Math.pow(10,i));
    }
    System.out.println(n_copy);
  }
}