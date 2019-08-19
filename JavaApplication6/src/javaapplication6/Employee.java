
package javaapplication6;

import java.util.Scanner;


public class Employee 
{
    public String Emp_name;
    public String Emp_position;
    public double    Emp_define;
    public double Emp_sallary;
    public double Emp_experience;
    
    public void get_info()
            {
                Scanner input = new Scanner(System.in);
                 Scanner input1 = new Scanner(System.in);
                 
                System.out.println("Enter the name of Employee : ");
                Emp_name=input.nextLine();
                
                System.out.println("Enter the name of Employee position  : ");
                System.out.print("if Employee is engineer enter 1 for Eng otherwise enter 2 : ");
                Emp_define=input1.nextDouble();
                
                System.out.println("Enter the job experience of the Employee : ");
                Emp_experience=input1.nextDouble();
                if(Emp_define == 1)
                {
                    Emp_position = "Engineer";
                    Emp_sallary=10000+1000*Emp_experience;
                }
                else 
                {
                    Emp_position= "clark";
                    Emp_sallary=5000+500*Emp_experience;
                }
            }
    public void show_info()
               {
                   System.out.println("Name of the Employee is : "+ Emp_name);
                  System.out.println("Position : "+ Emp_position);
                   System.out.println("Sallary : "+ Emp_sallary);
           
               }

}
