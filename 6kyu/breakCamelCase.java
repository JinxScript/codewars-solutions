/*Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
STRINGS FUNDAMENTALS*/







//MY SOLUTION 
class Solution {
  public static String camelCase(String input) {
   return input.replaceAll(
      String.format("%s|%s|%s",
         "(?<=[A-Z])(?=[A-Z][a-z])",
         "(?<=[^A-Z])(?=[A-Z])",
         "(?<=[A-Za-z])(?=[^A-Za-z])"
      ),
      " "
   );
  }
}


///OTHER SOLUTIONS 1

import java.util.Arrays;

class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}



//SOLUTION 2


class Solution {
  public static String camelCase(String input) {
    
    String x="";
    for(int i=0;i<input.length();i++)
    {
    if(Character.isUpperCase(input.charAt(i)))
    {
    x=x+" ";
    }
    x=x+input.charAt(i);
    
    }
 return x;
 }