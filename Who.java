import java.util.Scanner;

class Who{
  
  public static void main(String[] args) {
    System.out.println("Who are you");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println("Hello,"+ str +"!");
  }
}
