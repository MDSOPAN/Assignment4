import java.util.Scanner;
public class Task3{
  public static void main (String[] args){
    int n = 0;
    while(n >= 0){
      System.out.println("Enter Number: ");
      Scanner sc= new Scanner(System.in);
      n = sc.nextInt();
      if(n <0){
        break;
      }
      System.out.println(n*n);
    }
  }
}