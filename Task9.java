import java.util.Scanner;
public class Task9{
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while(true){
      n=n/10;
      count++;
      if(n==0){
        break;
      }
    }
    System.out.println("Total digits = "+count);
  }
}