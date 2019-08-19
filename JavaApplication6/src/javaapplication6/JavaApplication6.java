
package javaapplication6;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication6 
{

    public static void main(String[] args) 
    {
        int n,k=0,j=0;
        System.out.println("Input no. emloyee");
        Scanner take =new Scanner(System.in);
        n=take.nextInt();
        
        ArrayList<Employee> emplist = new ArrayList();
        
        for(int i = 0; i < n; i++) 
        {
         Employee e1= new Employee();
        emplist.add(e1);
        e1.get_info();       
         }
        
        System.out.println("###########");
        System.out.println("");
        
        for (Employee emplist1 : emplist) {
            if(emplist1.Emp_define==1)
            {
                ++k;
                System.out.println("Eng19_"+k);
            emplist1.show_info();
            }
            else
            {  ++j;
                System.out.println("Other19_"+j);
            emplist1.show_info();
                
            }
            
        }
        
        
        //Employee e1= new Employee();
        //e1.get_info();
        //e1.show_info();
    }
    
}
