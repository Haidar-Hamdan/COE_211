package MyClass;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     System.out.println("Which service would you like to use?");
     System.out.println("[1]: Basic week visualizer");
     System.out.println("[2]: Advanced week visualizer");
     System.out.println("[3]: Basic calculator");
     System.out.println("[4]: Employee repertoire");
     
     Scanner scan = new Scanner(System.in);
     String input = scan.nextLine();
     
     switch (input)
      {
          case "1":
          BasicWeek x= new BasicWeek();
          x.printDays();
          break;
          case "2":
              AdvancedWeek y= new AdvancedWeek();
              y.printDays();
          break;
          
      }
     
    }
}