import java.util.Scanner;
public class Task6{
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int c = 1;
    int sum = 0;
    System.out.println("The odd numbers are:");
    for(int i=1;i<=n;i++){      
      sum+=c;
      System.out.println(c);
      c+=2;
    }
    System.out.println("The Sum of odd Natural Numbers up to "+n+" terms is: " + sum);
  }
}