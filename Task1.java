public class Task1{
  public static void main (String[] args){
     //a
    for(int i=24;i>= -6;){
      System.out.print(i);
      if(i!=-6){
        System.out.print(",");
      }
      i-=6;
    }
    System.out.print("\n");
    //b
    for(int i=-10;i<= 20;){
      System.out.print(i);
      if(i!=20){
        System.out.print(",");
      }
      i+=5;
    }
  }
}