/***********************************
Lab: 03
Task: 01
Developer:
Roll #: BSEF11M026	
Name: JUNAID AHMED GHAURI
***********************************/

package Emp;

import java.util.*;
import javax.swing.*;


public class hourlyEmployee extends Employee implements Payable
{
public int hour,rate;

hourlyEmployee()
{ 
	super();
	hour=0;
	rate=0;

}

hourlyEmployee(String id,String name,int salary ,int hour,int rate)
{ 
	super(id,name,salary);
	this.hour=hour;
	this.rate=rate;

}
public int getPayableAmount()
{
	salary=hour*rate;
	return salary;
	
}


public void displayGui()
	{
		JOptionPane.showMessageDialog(null,"Your ID is "+id +"\nYour NAME is "+name+"\nYour SALARY is "+salary);	
		
	}

}
