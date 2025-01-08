package Package1;

public class Student 
{
	int rollNo;//rollNo is variable.
	int age;//age is variable.
	public void display1()//display is method.  
	{
	System.out.println("Welcome to all of you!!");
	}
	public void display2()//display is method.
	{
	System.out.println("Automation is very easy");
	}
     public static void main(String[] args) //Pillar no.2 main method creation.
    {
	Student Jyoti=new Student();//Pillar no.3 object creation inside main method.
	Jyoti.display1(); //Call both the method 
	Jyoti.display2();
	Jyoti.rollNo=12;//Pillar No.4 Call the both Variables,assign values and print the both values.
    System.out.println(Jyoti.rollNo);
    Jyoti.age=25;
    System.out.println(Jyoti.age);
    }
}
