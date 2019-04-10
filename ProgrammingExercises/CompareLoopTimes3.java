import java.time.*;

public class CompareLoopTimes3
{
   public static void main(String[] args)
   {
      int startTime, endTime;
      int startSecond, endSecond;
      final int REPEAT = 100000;
      final int FACTOR = 1000000;
      final int NANOSECONDS_IN_SECONDS = 1000000000;
      final int MILLISECONDS = 10000000;

      LocalDateTime now;
      now = LocalDateTime.now();
      startTime = now.getNano();
      startSecond = now.getSecond();
      for (int x = 0; x <= REPEAT; ++x);
         for(int y = 0; y <= REPEAT; ++y);
      now = LocalDateTime.now();
      endTime = now.getNano();
      endSecond = now.getSecond();

      endSecond = startSecond + 1;
      startTime = NANOSECONDS_IN_SECONDS - MILLISECONDS;
      endTime = MILLISECONDS;

      if(startSecond != endSecond)
         endTime = endTime + NANOSECONDS_IN_SECONDS;
      System.out.println("Time for loops starting from 0: " + ((endTime - startTime) / FACTOR) + " miliseconds");

      now = LocalDateTime.now();
      startTime = now.getNano();
      for(int x = REPEAT; x >= 0; --x )
         for(int y = REPEAT; y >= 0; --y);
      now = LocalDateTime.now();
      endTime = now.getNano();
      endSecond = now.getSecond();

      endSecond = startSecond + 1;
      startTime = NANOSECONDS_IN_SECONDS - MILLISECONDS;
      endTime = MILLISECONDS;

      if(startSecond != endSecond)
         endTime = endTime + NANOSECONDS_IN_SECONDS;
      System.out.println("Time for loops ending with 0: " + ((endTime - startTime) / FACTOR) + " miliseconds");
   }
}
