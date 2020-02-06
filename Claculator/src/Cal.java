import java.util.Scanner;
public class Cal {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static double div(int a,int b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter your chocies");
		System.out.println(" 1\tAdd\n 2\tSubtract\n 3\tMultiply\n 4\tDivide");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:	System.out.println("result="+add(a,b));break;
		case 2: System.out.println("result="+sub(a,b));break;
		case 3: System.out.println("result="+mul(a,b));break;
		case 4: System.out.println("result="+div(a,b));break;
		default: System.out.println("enter valid chocies");
		}
		
	}

}
