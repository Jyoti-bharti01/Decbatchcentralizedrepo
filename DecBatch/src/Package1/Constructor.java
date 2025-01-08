package Package1;

public class Constructor 
{
	public Constructor(int a,int b,int c) 
	{
		System.out.println("Three Parameterized Constructor");
	}
	public Constructor()
	{
		this (12,13,14);
		System.out.println("Default Constructor");
	}
	public Constructor(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public Constructor(int a,int b)
	{
		this (13);
		System.out.println("Two Parameterized Constructor");
	}
	public static void main(String[] args)
	{
		Constructor Ass1=new Constructor(13,18);
	
	}
}