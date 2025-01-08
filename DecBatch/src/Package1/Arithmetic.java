package Package1;
//Assigment1 ((((10+2)+2)-2)*2)/2)
public class Arithmetic 
{
 public int Sum(int a,int b)
 {
	   int c=a+b;
	   System.out.println("the value of Addition ="+c);
	   return c;  
 }
 public int sub(int x,int y)
 {
	   int z=x-y;
	   System.out.println("the value of Substraction ="+z);
	   return z;
 }
 public int Mul(int e,int f)
 {
	   int g=e*f;
	   System.out.println("the value of Multiplication ="+g);
	   return g;
 }
 public void div(int i,int j)
 {
	   int k=i/j;
	   System.out.println("the final value is ="+k);
 }
 public static void main(String[] args) 
 {
	  System.out.println("Assignment 1");
	  Arithmetic Result= new Arithmetic();
	  
	  int sum1= Result.Sum(10,2);
	  int sum2= Result.Sum(sum1,2);
	  int sub= Result.sub(sum2,2);
	  int Mul= Result.Mul(sub, 2);
	  Result.div(Mul,2);
	  
	  System.out.println("Assignment 2");
	//Assigment2 ((((10*2)-2)+2)-2)/2)
	  Arithmetic Ans= new Arithmetic();
	  
	  int Mul1= Ans.Mul(10,2);
	  int sub1= Ans.sub(Mul1,2);
	  int sum3= Ans.Sum(sub1,2);
	  int sub2= Ans.sub(sum3, 2);
	  Ans.div(sub2,2);
  }
}