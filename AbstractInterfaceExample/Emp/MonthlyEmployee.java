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



public class monthlyEmployee extends Employee implements Payable
{
public int month,rate;

monthlyEmployee()
{ 
	super();
	month=0;
	rate=0;

}

monthlyEmployee(String id,String name,int salary ,int month,int rate)
{ 
	super(id,name,salary);
	this.month=month;
	this.rate=rate;

}
public int getPayableAmount()
{
	salary=month*rate;
	return salary;
	
}


public void displayGui()
	{
		JOptionPane.showMessageDialog(null,"Your ID is "+id +"\nYour NAME is "+name+"\nYour SALARY is "+salary);	
		
	}

}

//-----------------------------------------------------------------------
