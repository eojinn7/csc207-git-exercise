import java.io.PrintWriter;

public class HelloWorld {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Hello, Github!");
    pen.flush();
  } // main
} // class
