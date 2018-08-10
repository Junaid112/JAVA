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


public class weeklyEmployee extends Employee
{
public int week,rate;

weeklyEmployee()
{ 
	super();
	week=0;
	rate=0;

}

weeklyEmployee(String id,String name,int salary ,int week,int rate)
{ 
	super(id,name,salary);
	this.week=week;
	this.rate=rate;

}
public int getPayableAmount()
{
	salary=week*rate;
	return salary;
	
}


public void displayGui()
	{
		JOptionPane.showMessageDialog(null,"Your ID is "+id +"\nYour NAME is "+name+"\nYour SALARY is "+salary);	
		
	}

}

