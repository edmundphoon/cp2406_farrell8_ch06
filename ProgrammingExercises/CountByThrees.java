public class CountByThrees
{
   public static void main(String args[])
   {
      final int START = 3;
      final int END = 300;

      for(int i = START; i <= END; i += 3) {
         System.out.print("  " + i);
         if ((i % 30 == 0))
            System.out.println();
      }
   }
}