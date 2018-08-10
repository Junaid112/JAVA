/***********************************
Lab: 02	
Task: 02
Developer:
Roll #: BSEF11M026
Name: JUNAID GHUARI
***********************************/

import javax.swing.*;
import java.util.*;

class Date
{

private int day,month,year;

//----constructors ..
	Date()
	{
		day=1;
		month=1;
		year=2000;
	}
	Date(int day,int month,int year)
	{
		if(month>=1 && month<=12)
		{
			if(month==1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)
			{
				if(day>=1 && day<=31)
				{
					this.day=day;
					this.month=month;
					this.year=year;
				}
				else
				{
					day=1;
					month=1;
					year=2000;
					JOptionPane.showMessageDialog(null,"You Enter Invalid input..! \nDate has been set By default values(1/January/2000))");	
				}		
			}
			if(month==2)
			{
				if(year%4==0 || year%400==0)
				{
					if(day>=1 && day<=29)
					{
						this.day=day;
						this.month=month;
						this.year=year;
					}
					else
					{
						day=1;
						month=1;
						year=2000;
						JOptionPane.showMessageDialog(null,"You Enter Invalid input..! \nDate has been set By default values(1/January/2000))");	
					}
				
				}
				else
				{
					if(day>=1 && day<=28)
					{
						this.day=day;
						this.month=month;
						this.year=year;
					}
					else
					{
						day=1;
						month=1;
						year=2000;
						JOptionPane.showMessageDialog(null,"You Enter Invalid input..! \nDate has been set By default values(1/January/2000))");	
					}	
				}	
			}
			if(month==4 || month==6 ||month==9 ||month==11)
			{
				if(day>=1 && day<=30)
				{
					this.day=day;
					this.month=month;
					this.year=year;
				}
				else
				{
					day=1;
					month=1;
					year=2000;
					JOptionPane.showMessageDialog(null,"You Enter Invalid input..! \nDate has been set By default values(1/January/2000))");	
				}
	
			}
			


		}
		else
		{
			day=1;
			month=1;
			year=2000;
			JOptionPane.showMessageDialog(null,"You Enter Invalid input..! \nDate has been set By default values(1/January/2000))");
			
		}
		
		
	}

//-------Setters ---------------------------
	public void setDay(int day)
	{
		
			if(month==1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)
			{
				if(day>=1 && day<=31)
				{
					this.day=day;
					
				}
				else
				{
					day=1;
					
					JOptionPane.showMessageDialog(null,"You Enter Invalid day input..! \nDay has been set By default values(1))");	
				}		
			}
			if(month==2)
			{
				if(year%4==0 || year%400==0)
				{
					if(day>=1 && day<=29)
					{
						this.day=day;
						
					}
					else
					{
						day=1;
						JOptionPane.showMessageDialog(null,"You Enter Invalid day input..! \nDay has been set By default values(1))");
					}
				
				}
				else
				{
					if(day>=1 && day<=28)
					{
						this.day=day;
						
					}
					else
					{
						day=1;
						JOptionPane.showMessageDialog(null,"You Enter Invalid day input..! \nDay has been set By default values(1))");	
					}	
				}	
			}
			if(month==4 || month==6 ||month==9 ||month==11)
			{
				if(day>=1 && day<=30)
				{
					this.day=day;
					
				}
				else
				{
					day=1;
					
					JOptionPane.showMessageDialog(null,"You Enter Invalid day input..! \nDay has been set By default values(1))");	
				}
	
			}
			


		
		

	
	}
	public void setMonth(int month)
	{
		if(month>=1 && month<=12)
		{
			this.month=month;
		}
		else
		{
			month=1;		
			JOptionPane.showMessageDialog(null,"You Enter Invalid month input..! \nmonth has been set By default values(January))");
		}	
	}
	public void setYear(int year)
	{
		this.year=year;	
	}
	

//-------------------------------------------

//------- Getters ---------------------------
	
	public int getDay()
	{
		return day;	
	}
	public int getMonth()
	{
		return month;	
	}
	public int getYear()
	{
		return year;	
	}
	
//------------------------------------------

public void displayGui()
	{
		
		if(month==1)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/January/"+year);	
		if(month==2)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/February/"+year);	
		if(month==3)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/March/"+year);	
		if(month==4)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/April/"+year);	
		if(month==5)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/May/"+year);	
		if(month==6)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/June/"+year);	
		if(month==7)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/July/"+year);	
		if(month==8)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/August/"+year);	
		if(month==9)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/September/"+year);	
		if(month==10)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/October/"+year);	
		if(month==11)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/November/"+year);	
		if(month==12)
		JOptionPane.showMessageDialog(null,day+"/"+month+"/"+year+"\n"+day+"/December/"+year);	
		
	}







	public static void main(String[] args)
	{
		// -----creating two Date onjects by different constructors

		Date d=new Date(31,12,2013);
		Date d2=new Date();
		

//------check for february

		d2.setYear(2012);
		d2.setMonth(2);
		d2.setDay(31);
		
//------------------GUI display Both format
	
		d2.displayGui();
		d.displayGui();


	}

}