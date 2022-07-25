/*A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

STRINGSDATA STRUCTURES FUNDAMENTALS*/




public class PangramChecker {
  public boolean check(String sentence){
  String  letter = sentence.toLowerCase();
    if ( letter.contains("a") && letter.contains("b") && 
        letter.contains("c") &&letter.contains("d") && letter.contains("e") &&
       letter.contains("f") &&
       letter.contains("g") &&
       letter.contains("h") &&
       letter.contains("i") &&
       letter.contains("j") &&
       letter.contains("k") &&
       letter.contains("l") &&
       letter.contains("m") &&
       letter.contains("n") &&
       letter.contains("o") &&
       letter.contains("p") &&
       letter.contains("q") &&
       letter.contains("r") &&
       letter.contains("s") &&
       letter.contains("t") &&
       letter.contains("u") &&
       letter.contains("v") &&
       letter.contains("w") &&
       letter.contains("x") &&
       letter.contains("y") &&
       letter.contains("z") ){
      return true;
    }else{
      return false;
    }
  }
}


