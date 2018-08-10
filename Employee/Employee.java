/***********************************
Lab: 002
Task: 01
Developer:
Roll #: BSEF11M026
Name: JUNAID
***********************************/


import java.util.*;
import javax.swing.*;

class Employee
{

private String id,name,designation;
private int salary;
	Employee( )
	{
		id=null;
		name=null;
		designation=null;
		salary=0;	
	}
		
	Employee(String id,String name,int salary,String designation )
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;	
	}

//-------Setters ---------------------------
	public void setId(String id)
	{
		this.id=id;	
	}
	public void setName(String name)
	{
		this.name=name;	
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;	
	}
	public void setSalary(int salary)
	{
		this.salary=salary;	
	}

//-------------------------------------------

//------- Getters ---------------------------
	
	public String getId()
	{
		return id;	
	}
	public String getName()
	{
		return name;	
	}
	public String getDesignation()
	{
		return designation;	
	}
	public int getSalary()
	{
		return salary;	
	}
//------------------------------------------

	public void displayConsol()
	{
		System.out.println("ID is: "+id);	
		System.out.println("NAME is: "+name);
		System.out.println("Designation is: "+designation);
		System.out.println("Salary is"+salary);	
	}
	public void displayGui()
	{
		JOptionPane.showMessageDialog(null,"Your ID is "+id +"\nYour NAME is "+name+"\nYour Designation is "+designation+"\nYour SALARY is "+salary);	
		
	}

	
	public int calculateSalary(int hour, int hrate)
	{
		salary=hour*hrate;
		return salary;	
	}
	public void changeDesignation()
	{
		
		this.setDesignation(JOptionPane.showInputDialog("** Do you want to change Designation..? **\n Click Ok for Yes .. "));	
	}



	public static void main(String[] args)
	{
		Employee e1=new Employee("BSEF11M00","JUNAID",50000,"NetworkAdministrator");
		Employee e2=new Employee();
		
		e1.displayConsol();
		e1.displayGui();
		
		e2.setId(JOptionPane.showInputDialog("** Enter your Id Below **"));
		e2.setName(JOptionPane.showInputDialog("** Enter your NAME Below **"));	
		e2.setDesignation(JOptionPane.showInputDialog("** Enter your Designation Below **"));
		
		String s=JOptionPane.showInputDialog("** Enter your Salary Below **");
		int si=Integer.parseInt(s);


		e2.setSalary(si);	
		
		e2.displayGui();
		e2.changeDesignation();
	
	}

}