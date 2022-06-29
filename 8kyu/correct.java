

/*
Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.

When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.

Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.

FUNDAMENTALS*/


//MY SOLUTION
public class Correct {
  public static String correct(String string) {
    return string.replace("5", "S").replace("0", "O").replace("1", "I");
  
      }
    }
  

  //OTHER SOLUTION


  ublic class Correct {
    public static String correct(String string) {
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            switch (c) {
                case '5':
                    result.append('S');
                    break;
                case '0':
                    result.append('O');
                    break;
                case '1':
                    result.append('I');
                    break;
                default:
                    result.append(c);
            }
        }

        return result.toString();
    }
}
public class Correct {
  
  public static String correct(String string) {
    
    String[] stringLetters = string.split("");
    String answer = "";
    
    for (String s : stringLetters) {
      if (s.equals("5"))
        answer += "S";
      else if (s.equals("0"))
        answer += "O";
      else if (s.equals("1"))
        answer += "I";
      else
        answer += s;
    }
    
    return answer;
  }
}
import java.util.Arrays;
public class Correct {
  public static String correct(String string) {
    char[] sc = string.toCharArray();
    String s = "";
    for(char c:sc){
      if(c =='5'){
        s += 'S';
      }else if(c == '0'){
        s += 'O';
      }else if(c == '1'){
        s += 'I';
      }else{
        s += c;
      }
    }
    return s;
  }
}