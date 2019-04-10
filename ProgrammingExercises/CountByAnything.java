import java.util.Scanner;

public class CountByAnything
{
   public static void main(String args[])
   {
      final int START;
      Scanner input = new Scanner(System.in);
      START = input.nextInt();
      final int END = 300;

      for(int i = START; i <= END; i += START) {
         System.out.print("  " + i);
         if ((i == 10))
            System.out.println();
      }
   }
}