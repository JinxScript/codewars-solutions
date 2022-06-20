

//Write a function which calculates the average of the numbers in a given list.

//Note: Empty arrays should return 0.




public class Kata{
  public static double find_average(int[] array){
    
    double  average = 0;
    double  total = 0;
    
    for(int i = 0; i < array.length; i++ ){
      total = total + array[i];
    }
    average = total / array.length;
    
    return average;
  }
}