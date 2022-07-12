/*Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):


348597 => [7,9,5,8,4,3]
0 => [0]

tags : ARRAYS FUNDAMENTALS

        ****************************************
        *              MY solution             *
        *                                      *
        ****************************************
*/


public class Kata {
  public static int[] digitize(long n) {
   String temp = Long.toString(n);
    
    int[] number = new int[temp.length()];
    int  length = temp.length();
    
    for (int i = 0; i < length; i ++){
       // Casting a char to int returns its ascii value. 
      // The ascii value for '0' for example is 48, 
      // so subtracting 48 from it will convert it into its proper int value.
      number[i] = (int) (temp.charAt(length - i - 1)) - 48;
    }
    return  number;
  }
}

 /*     ****************************************
        *              other solutions         *
        *                                      *
        ****************************************
        
        
*/
// Using StringBuilder
public class Kata {
  public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
  }
}
//using array lists
import java.util.ArrayList;

public class Kata {
  public static int[] digitize(long n) {
    
    // use ArrayList because of unknown digit count:
    ArrayList<Integer> res = new ArrayList();
    long div = n;
    int dig;
    
    while (div != 0) {
      dig = (int) (div % 10); // explicitly cast result to int 
      div = div / 10;
      res.add(dig);
    }
    
    // convert ArrayList<Integer> to int[] (https://stackoverflow.com/a/23945015/1708932):
    int[] array = res.stream().mapToInt(i->i).toArray();
    
    return array;
    
  }
}