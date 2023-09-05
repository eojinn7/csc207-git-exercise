import java.lang.String;

public class CaesarCipherNew {
  public static void main (String[] args) {
    java.io.PrintWriter pen;
    pen = new java.io.PrintWriter(System.out, true);

    // error handling
    if (args.length != 2) {
      System.err.println ("Incorrect number of parameters ");
      System.exit(2);
    }       

    String str;
    str = args[1];

    int shifts = 26;
    int base = (int) 'a';

    if ("encode".equals(args[0])) {

      int[] intArray = new int[str.length()];
      char[] encChar = new char[str.length()];

      for (int n = 0; n < shifts; n ++) {
        pen.printf("n = %d: ", n);

        for (int i = 0; i < str.length(); i++) {
          int ch = str.charAt(i) - base; 
          int en = (ch + n) % 26; 

          intArray[i] = en; // encoded letter (in int form) save to intArray
          encChar[i] = (char) (en + base); // encoded lette in char form save to encChar
        }
        
        String encString = new String(encChar); // declare encoded string
        pen.println(encString);
      }
    }
    else if ("decode".equals(args[0])) {
      pen.println("decode");
    }
    else {
      System.err.println ("Valid options are \"encode\" or \"decode\"");
      System.exit(1);
    }
  }
}
