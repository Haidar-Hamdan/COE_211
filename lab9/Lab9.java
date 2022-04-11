
package lab9;

import java.util.Scanner;

public class Lab9 
{
    public static void main(String[] args) 
  {
      int grade;
      int[] Grades= new int[6];
      Scanner scan= new Scanner(System.in);
int sum=0;
    for (int i = 1; i <6; i++)
    {
        System.out.println("Input the grade for assignment "+i+": ");
        Grades[i] = scan.nextInt();
       sum += Grades[i];
    }
        System.out.println("Input the number of attended labs: ");
        int attend=scan.nextInt();
        
       System.out.println("Input the midterm grade: ");
       int midtrm=scan.nextInt();   
       
       double assign=sum/5*0.3;
       double atten= (attend*5)/7.;
       double mid= midtrm*0.3; 
      
       System.out.println("Assignments (30%): "+assign);
       System.out.println("Attendance (5%): "+atten);
       System.out.println("Midterm (30%): "+mid);



  }

}
