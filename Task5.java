import java.util.Scanner;
public class Task5{
  public static void main (String[] args){
    System.out.println("Enter an integer:");
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int pcount = 0 , ncount = 0;
    for(int i=1;i<=n;i++){      
      System.out.println("Enter number "+i+":");
      int in = sc.nextInt();
      if(in >0){
        pcount++;
      }else{
        ncount++;
      }
    }
    System.out.println(pcount+" Non negative numbers");
    System.out.println(ncount+" negative numbers");
  }
}