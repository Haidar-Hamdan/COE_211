
package lab8;

import java.io.*;
import java.util.*;

    public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
    
    FileWriter F=new FileWriter(new File("expenses.txt")); 
    PrintWriter P=new PrintWriter(F);
    Scanner scan =new Scanner(System.in),Fromfile=new Scanner("expenses.txt");
    String name,product,ans;
    double price;
    do{
    System.out.println("Input your name:");
        name=scan.next();
    
    System.out.println("What did you purchase?");
        product=scan.next();    
    
    System.out.println("How much did you pay? (in USD)");
        price=scan.nextDouble();
     scan.nextLine();
    System.out.println("Would you like to log another purchase?(y/n)");
    ans=scan.nextLine();
    
    P.println(name+ " purchased "+product +" for " +price+" US Dollars.");
    }
    while(ans.equalsIgnoreCase("y"));
    
    
    P.close();
    scan.close();
        System.out.println("Get off of ZoodMall!");
        
    }}