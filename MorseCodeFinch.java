//  imports
import java.util.ArrayList;

public class MorseCodeFinch extends Finch {

   //  fields
   private String message;
   private ArrayList<String> translatedMessage;

   MorseCodeFinch() {
      super();
   }
   
   MorseCodeFinch(String device) {
      super(device);
   }
   
   MorseCodeFinch(String device, String message) {
      super(device);
      this.message = message;
   }
   
   //  the run method
   public void run() {
      
      translate();
      morseCodeMicrobit();
   }
   
   //  the morse code microbit message method
   public void morseCodeMicrobit() {
      
      //  dot
      final int[] DOT = {1, 1, 1, 1, 1,
                         1, 1, 1, 1, 1,
                         1, 1, 1, 1, 1,
                         1, 1, 1, 1, 1,
                         1, 1, 1, 1, 1};
      
      //  dash
      final int[] DASH = {0, 0, 0, 0, 0, 
                          1, 1, 1, 1, 1,
                          1, 1, 1, 1, 1,
                          0, 0, 0, 0, 0,
                          0, 0, 0, 0, 0};
                            
      
      //  displaying the message
      for (int i = 0; i < this.translatedMessage.size(); i++) {
         // int[] toDisplay = (this.translatedMessage.get(i).equals("0")) ? DASH : DOT;
//          setDisplay(toDisplay);
//          pause(1);
            
            setDisplay(DASH);
            pause(0.25);
      }
   }
   
   //  the morse code sound message method
   public void morseCodeSound() {
   
   }
   
   //  the translate method
   //  translates the String into morse code
   public void translate() {
      
      //  turning message into an array
      String[] messageArray = new String[this.message.length()];
      for (int i = 0; i < this.message.length(); i++) {
         messageArray[i] = this.message.substring(i, i + 1);
      }
      
      //  all of the letters in morse code
      //  0 = dash, 1 = dot
      final String A = "10";
      final String B = "0100";
      final String C = "0101";
      final String D = "011";
      final String E = "1";
      final String F = "1101";
      final String G = "001";
      final String H = "1111";
      final String I = "11";
      final String J = "1000";
      final String K = "010";
      final String L = "1011";
      final String M = "00";
      final String N = "01";
      final String O = "000";
      final String P = "1001";
      final String Q = "0010";
      final String R = "101";
      final String S = "111";
      final String T = "0";
      final String U = "110";
      final String V = "1110";
      final String W = "100";
      final String X = "0110";
      final String Y = "0100";
      final String Z = "0011";
      
      //  turning the letters in message array into an ArrayList<String>
      ArrayList<String> morseList = new ArrayList<String>();
      for (int i = 0; i < messageArray.length; i++) {
         String letter = messageArray[i].toUpperCase();
         switch (letter) {
            case "A": 
               morseList.add(A);
               break;
            case "B":
               morseList.add(B);
               break;
            case "C":
               morseList.add(C);
               break;
            case "D":
               morseList.add(D);
               break;
            case "E":
               morseList.add(E);
               break;
            case "F":
               morseList.add(F);
               break;
            case "G":
               morseList.add(G);
               break;
            case "H":
               morseList.add(H);
               break;
            case "I":
               morseList.add(I);
               break;
            case "J":
               morseList.add(J);
               break;
            case "K":
               morseList.add(K);
               break;
            case "L":
               morseList.add(L);
               break;
            case "M":
               morseList.add(M);
               break;
            case "N":
               morseList.add(N);
               break;
            case "O":
               morseList.add(O);
               break;
            case "P":
               morseList.add(P);
               break;
            case "Q":
               morseList.add(Q);
               break;
            case "R":
               morseList.add(R);
               break;
            case "S":
               morseList.add(S);
               break;
            case "T":
               morseList.add(T);
               break;
            case "U":
               morseList.add(U);
               break;
            case "V":
               morseList.add(V);
               break;
            case "W":
               morseList.add(W);
               break;
            case "X":
               morseList.add(X);
               break;
            case "Y":
               morseList.add(Y);
               break;
            case "Z":
               morseList.add(Z);
               break;
         }
      }
      
      this.translatedMessage = morseList;
   }
   
}