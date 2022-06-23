/*Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
STRINGSFUNDAMENTALS*/

//MY SOLUTION

public class Kata {

  public static String solution(String str) {
    String reversedString = "";
    String[] strArray = null;
    strArray = str.split("");
    for (int i = strArray.length - 1; i >= 0; i--){
      reversedString += strArray[i];
    }
    return reversedString;
  }

}