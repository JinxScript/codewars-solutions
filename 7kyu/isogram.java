/*An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
STRINGSFUNDAMENTALS */

//imported this as it contains the sorting  algorithm
import java.util.Arrays;   
public class isogram {
    public static boolean  isIsogram(String str) {
     
     
     //this method was used to change to lowercase 
     str = str.toLowerCase();

     // the str string is chanfed to an char array
      char sArr[] = str.toCharArray();

      //this was used as it would have made the for loop look bluky 
      int len = str.length();
      //sorting the arry 
      Arrays.sort(sArr);
      
      //for loop one going throug the array but not ahead
      for (int i =0; i < len - 1; i++){
        //if they are equal or not 
       if (sArr[i]== sArr[i+1]){
         return false;
       }
     }return true ;
    } 
}