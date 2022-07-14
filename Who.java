import java.util.Scanner;

class Who{
  
  public String who(){
    System.out.println("Who are you");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println("Hello,"+ str +"!");
    
    return str;
  }
}
