import java.util.Scanner;
public class Task7{
  public static void main (String[] args){
    
    Scanner sc= new Scanner(System.in);
    int sum = 0;
    for(int i=1;i<=10;i++){      
      System.out.println("Enter Number:");
      int n = sc.nextInt();
      sum+=n;
      System.out.println(sum);
    }
    
  }
}