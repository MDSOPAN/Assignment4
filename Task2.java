import java.util.Scanner;
public class Task2{
  public static void main (String[] args){
     //a
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    for(int i=0;i< n;i++){
      sum+= sc.nextInt();
    }
    double avg = (double)sum/(double)n;
    System.out.println("The sum of "+n+" nubers is " + sum);
    System.out.println("The Average is " + avg);
  }
}