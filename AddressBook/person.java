/***********************************
Lab: 03
Task: 
Developer:
Roll #: BSEF11M026	
Name: JUNAID AHMED GHAURI
***********************************/



package person;
import javax.swing.*;

class person
{
	protected String name;
	protected String address;
	protected String phone;

public person()
{
	name=" ";
	address=" ";
	phone=" "; 
}
public person(String name,String address,String phone)
{
	this.name=name;
	this.address=address;
	this.phone=phone; 

}
public void show()
{
	JOptionPane.showMessageDialog(null,"Name of person is:" + name+"\n Address of person is:" + address+"\nPhone-number of person is:" + phone);
	
}
// setters
public void setName(String name)
{
	this.name=name;
}
public void setAddress(String address)
{
	this.address=address;
}
public void setPhone(String phone)
{
	this.phone=phone;
}

//getters

public String getName()
{
	return name;
}	
public String getAddress()
{
	return address;
}
public String getPhone()
{
	return phone;
}

//end class
}
//-----------------------------------------------------------------------------------------------------------------------

class student extends person
{
	protected String rollnum;
	protected float cgpa;

public student()
{
	super();
	rollnum="";
	cgpa=0;	

}
public student(String name,String address,String phone,String rollnum,float cgpa)
{
	super(name,address,phone);
	this.rollnum=rollnum;
	this.cgpa=cgpa;	
}

//setters

public void setCgpa(float cgpa)
{
	this.cgpa=cgpa;

}
public void setRollNum(String rollnum) 
{
	this.rollnum=rollnum;
}

//getters

public float getCgpa()
{
	return cgpa;
}

public String getRollNum()
{
	return rollnum;
}


public void show()
{
	JOptionPane.showMessageDialog(null,"Name  is:" + name+"\n Address is:" + address+"\nPhone-number  is:" + phone+"\nRollnum  is:" +rollnum+"\nCgpa  is:" + cgpa);
	
}

}

//--------------------------------------------------------------------------------------------

class Teacher extends person
{
	String empId; 
	String subject;

public Teacher()
{
	super();
	empId="";
	subject="";

}

public Teacher(String name,String address,String phone,String empId,String subject)
{
	super(name,address,phone);
	this.empId=empId;
	this.subject=subject;

}

//setters

public void setEmpId(String empId)
{
	this.empId=empId;

}
public void setSubject(String subject) 
{
	this.subject=subject;
}

//getters

public String getEmpid()
{
	return empId;
}

public String getSubject()
{
	return subject;
}

public void show()
{
	JOptionPane.showMessageDialog(null,"Name  is:" + name+"\n Address is:" + address+"\nPhone-number  is:" + phone+"\nEmployee ID  is:" +empId+"\nSubject  is:" + subject);
	
}









//end class

}