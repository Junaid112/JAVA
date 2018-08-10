/***********************************
Lab: 03
Task: 01
Developer:
Roll #: BSEF11M026	
Name: JUNAID AHMED GHAURI
***********************************/


import java.util.*;
import javax.swing.*;


public class Runner
{

public static void main(String[] args)
	{


		String nam=JOptionPane.showInputDialog("** Enter weekly employee Name  Below **");
		String idg=JOptionPane.showInputDialog("** Enter weekly employee ID  Below **");
		
		String weekg=JOptionPane.showInputDialog("** Enter weekly employee num of Week  Below **");
		int session=Integer.parseInt(weekg);
		
		String rateg=JOptionPane.showInputDialog("** Enter weekly employee rate per Week  Below **");
		int rate_int=Integer.parseInt(rateg);
		

		
		Employee  rf1;
		rf1=new weeklyEmployee(idg,nam,0,session,rate_int);

		rf1.getPayableAmount();

		rf1.displayGui();


//------------------------------------------------------------------------------------

		 nam=JOptionPane.showInputDialog("** Enter monthly employee Name  Below **");
		 idg=JOptionPane.showInputDialog("** Enter monthly employee ID  Below **");
		
		String monthg=JOptionPane.showInputDialog("** Enter monthly employee num of Month  Below **");
		session=Integer.parseInt(monthg);
		
		rateg=JOptionPane.showInputDialog("** Enter monthly employee rate per Month  Below **");
		 rate_int=Integer.parseInt(rateg);
		

		
		Employee  rf2=new monthlyEmployee(idg,nam,0,session,rate_int);

		rf2.getPayableAmount();


		rf2.displayGui();

//-------------------------------------------------------------------------------------------


		 nam=JOptionPane.showInputDialog("** Enter hourly employee Name  Below **");
		 idg=JOptionPane.showInputDialog("** Enter hourly employee ID  Below **");
		
		String hourg=JOptionPane.showInputDialog("** Enter hourly employee num of Hour  Below **");
		session=Integer.parseInt(hourg);
		
		rateg=JOptionPane.showInputDialog("** Enter hourly employee rate per Hour  Below **");
		 rate_int=Integer.parseInt(rateg);
		

		
		Employee  rf3=new monthlyEmployee(idg,nam,0,session,rate_int);

		rf3.getPayableAmount();

		rf3.displayGui();


//-------------------------------------------------------------------------------------------



	}


}