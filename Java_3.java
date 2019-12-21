import java.util.Scanner;


class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.printl("Enter a number");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if (num %2 ==0)
      System.out.printl("Even number");
    else
      System.out.printl("Odd number");

  }
}
