import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true)
      {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number");
    float s = input.nextFloat(); 
    if(s==0)
    {
      System.out.println("Zero");
    }
    else if(s<1 && s>0)
    {
      System.out.println("small");
    }
    else if(s>0 && s<1000000)
    {
       System.out.println("Positive");
    }
    else if(s<0)
    {
    System.out.println("Negative");
    }
    else if(s>1000000)
    {
      System.out.println("large");
    }
      }
  }
}


