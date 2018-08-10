/***********************************
Lab: 04
Task: 
Developer:
Roll #: BSEF11M026	
Name: JUNAID AHMED GHAURI
***********************************/

package peron;

import javax.swing.*;


class customException extends exception
{
 String msg;

customException()
{
 msg=" ";

}
customException(String msg)
{
 this.msg=msg;

}


public String toString()
{
 return "Record not Found  "+msg;

}



}

class AddressBook
{
	ArrayList<Teacher> al1;

	ArrayList<student> al2;	


AddressBook()
{

	al1=new ArrayList<Teacher>();

	al2=new ArrayList<student>();
}



public void addTeacher()
{

      String name,address,phone,empId,subject;
	name=JOptionPane.showInputDialog("Enter name ");
	address=JOptionPane.showInputDialog("Enter address ");
	phone=JOptionPane.showInputDialog("Enter phone ");
	empId=JOptionPane.showInputDialog("Enter empId ");
	subject=JOptionPane.showInputDialog("Enter subject ");
 
	
	teacher t=new Teacher(name.address,phone,empId,subject);

	al1.add(t);	

}


public void addStudent()
{
      String name,address,phone,rollnum,strcgpa;
	name=JOptionPane.showInputDialog("Enter name ");
	address=JOptionPane.showInputDialog("Enter address ");
	phone=JOptionPane.showInputDialog("Enter phone ");
	rollnum=JOptionPane.showInputDialog("Enter rollnum ");
	strcgpa=JOptionPane.showInputDialog("Enter cgpa ");
 
	float cgpa=Float.parseFloat(strcgpa);
	
	student s=new student(name.address,phone,rollnum,cgpa);

	al2.add(s);	

}
//-----------------------


public void searchTeacher(String name)
{
	bool chek=0;
 	for(int i=0; i<al1.size();i++)
	{
		Teacher temp=(Teacher)al1.get(i);
		
		if(name.equals( temp.getName() ))
		{
			temp.show();	

			chek=1;
		}	
	}

	if(chek==0)
	{
		throw new customException();
	}	

}


public void searchStudent(String name)
{
	bool chek=0;
 	for(int i=0; i<al2.size();i++)
	{
		student temp=(student)al2.get(i);
		
		if(name.equals( temp.getName() ))
		{
			temp.show();	

			chek=1;
		}	
	}

	if(chek==0)
	{
		throw new customException();
	}	

	
}

//-----------------------

public void removeTeacher(String name)
{
		int idx=-1;
 	for(int i=0; i<al1.size();i++)
	{
		Teacher temp=(Teacher)al1.get(i);
		
		if(name.equals( temp.getName() ))
		{
			temp.show();	

			idx=1;
		}	
	}

	if(idx>0)
	{
		al1.remove(idx);
	}
	else
	{
		throw new customException();
	}	

}

public void removeStudent(String name)
{
		int idx=-1;
 	for(int i=0; i<al2.size();i++)
	{
		student temp=(student)al2.get(i);
		
		if(name.equals( temp.getName() ))
		{
			temp.show();	

			idx=1;
		}	
	}

	if(idx>0)
	{
		al2.remove(idx);
	}
	else
	{
		throw new customException();
	}	


}


public static void main(Stirng args[])
{



try
{

	String input;


	input=JOptionPane.showInputDialog("\n 1-Add Student\n 2-Add Teacher\n 3-Delete Student\n 4-Delete Teacher\n 5-Search Student\n 6-Search Teacher\n 7- Exit\n ");
	int i=Integer.parseInteger(input);


       AddressBook A=new AddressBook();

	switch(i)
	{
	case 1:		
		A.addStudent();
		break;
	
	case 2:		
		A.addTeacher();
		break;
	case 3:		
		A.removeStudent();
		break;
	case 4:		
		A.removeTeacher();
		break;
	case 5:		
		A.searchStudent();
		break;
	case 6:		
		A.searchTeacher();
		break;
	case 7:		
		A.addStudent();
		break;

	default:
		return ;
	}
	

}


catch(customException ce)
{


}
catch(exception e)
{

}



}

//-------------------------------------
}







