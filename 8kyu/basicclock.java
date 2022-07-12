












}

 /*     ****************************************
        *              My solution             *
        *                                      *
        ****************************************
        
        
*/




public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    
   int hoursToMillisec =  60*h*60000;
   int minutesToMillisec = m* 60000;
   int secondsToMillisec = s*1000;
   int time =  hoursToMillisec + minutesToMillisec + secondsToMillisec;
    return time ;
  }
}



}

 /*     ****************************************
        *              other solutions         *
        *                                      *
        ****************************************
        
        
*/

//1
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    return h * 3600000 + m * 60000 + s * 1000;
  }
}

///2
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    return 1000*(s+60*(m+60*h));
  }
}
//3

import java.time.Duration;

public class Clock {
  public static int Past(int h, int m, int s) {
    return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
  }
}