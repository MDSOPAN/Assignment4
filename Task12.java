import java.util.Scanner;
public class Task12{
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int p_count =0;
    int sum = 0;
    for(int i=1;i<=n;i++){      
      if(n%i == 0){
        p_count++;
        if(i!=n){
          sum+= i;
        }
        
      }
    }
    if(p_count==2){
      System.out.println(n+" is a prime number");
    }else{
    System.out.println(n+" is not a prime number");
    }
    
    if(n==sum){
      System.out.println(n+" is a perfect number");
    }else{
    System.out.println(n+" is not a perfect number");
    }
  }
}