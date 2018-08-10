
/***********************************
Lab: 03
Task: 
Developer:
Roll #: BSEF11M026	
Name: JUNAID AHMED GHAURI
***********************************/
import java.util.*;
import javax.swing.*;


Interface Payable
{
	public int getPayableAmount();


}


abstract class Employee implements Payable
{

public String id,name;
public int salary;
	Employee( )
	{
		id=null;
		name=null;
		
		salary=0;	
	}
		
	Employee(String id,String name,int salary )
	{
		this.id=id;
		this.name=name;
		this.salary=salary;	
	}
	
	public abstract int getPayableAmount();


//-------Setters ---------------------------
	public void setId(String id)
	{
		this.id=id;	
	}
	public void setName(String name)
	{
		this.name=name;	
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
	public int getSalary()
	{
		return salary;	
	}
//------------------------------------------


public void displayGui()
	{
		JOptionPane.showMessageDialog(null,"Your ID is "+id +"\nYour NAME is "+name+"\nYour SALARY is "+salary);	
		
	}

}




// All three employee types
//-----------------------------------------------------------------------

class WeeklyEmployee extends Employee implements Payable
{
public int week,rate;

WeeklyEmployee()
{ 
	super.Employee();
	week=0;
	rate=0;

}

WeeklyEmployee(String id,String name,int salary ,int week,int rate)
{ 
	super(id,name,salary);
	this.week=week;
	this.rate=rate;

}
pubic int getPayableAmount()
{
	salary=week*rate;
	return salary;
	
}


}


//-----------------------------------------------------------------------

class monthlyEmployee extends Employee implements Payable
{
public int month,rate;

monthlyEmployee()
{ 
	super.Employee();
	month=0;
	rate=0;

}

monthlyEmployee(String id,String name,int salary ,int month,int rate)
{ 
	super(id,name,salary);
	this.month=month;
	this.rate=rate;

}
pubic int getPayableAmount()
{
	salary=month*rate;
	return salary;
	
}


}

//-----------------------------------------------------------------------


class hourlyEmployee extends Employee implements Payable
{
public int hour,rate;

hourlyEmployee()
{ 
	super.Employee();
	hour=0;
	rate=0;

}

hourlyEmployee(String id,String name,int salary ,int hour,int rate)
{ 
	super(id,name,salary);
	this.hour=hour;
	this.rate=rate;

}
pubic int getPayableAmount()
{
	salary=hour*rate;
	return salary;
	
}


}
//-----------------------------------------------------------------------


	public static void main(String[] args)
	{


		String nam=JOptionPane.showInputDialog("** Enter weekly employee Name  Below **");
		String idg=JOptionPane.showInputDialog("** Enter weekly employee ID  Below **");
		
		String weekg=JOptionPane.showInputDialog("** Enter weekly employee num of Week  Below **");
		int session=Integer.parseInt(weekg);
		
		String rateg=JOptionPane.showInputDialog("** Enter weekly employee rate per Week  Below **");
		int rate_int=Integer.parseInt(rateg);
		

		
		Employee  rf1=new weeklyEmployee("BSE","JUN",0,session,rate_int);
		rf1.getPayableAmount();
		jOptionPane.showMessageDialog(null,"\nEmployee ID is"+rf1.id+"\nEmployee Name is"+rf1.name+"\nEmployee Salary is"+rf1.salary);


//------------------------------------------------------------------------------------

		 nam=JOptionPane.showInputDialog("** Enter monthly employee Name  Below **");
		 idg=JOptionPane.showInputDialog("** Enter monthly employee ID  Below **");
		
		String monthg=JOptionPane.showInputDialog("** Enter monthly employee num of month  Below **");
		session=Integer.parseInt(monthg);
		
		rateg=JOptionPane.showInputDialog("** Enter monthly employee rate per Week  Below **");
		 rate_int=Integer.parseInt(rateg);
		

		
		Employee  rf2=new monthlyEmployee("BSE","JUN",0,session,rate_int);
		jOptionPane.showMessageDialog(null,"\nEmployee ID is"+rf2.id+"\nEmployee Name is"+rf2.name+"\nEmployee Salary is"+rf2.salary);

//-------------------------------------------------------------------------------------------


		 nam=JOptionPane.showInputDialog("** Enter hourly employee Name  Below **");
		 idg=JOptionPane.showInputDialog("** Enter hourly employee ID  Below **");
		
		String hourg=JOptionPane.showInputDialog("** Enter hourly employee num of month  Below **");
		session=Integer.parseInt(hourg);
		
		rateg=JOptionPane.showInputDialog("** Enter hourly employee rate per Week  Below **");
		 rate_int=Integer.parseInt(rateg);
		

		
		Employee  rf3=new monthlyEmployee("BSE","JUN",0,session,rate_int);
		jOptionPane.showMessageDialog(null,"\nEmployee ID is"+rf3.id+"\nEmployee Name is"+rf3.name+"\nEmployee Salary is"+rf3.salary);

//-------------------------------------------------------------------------------------------



	}
