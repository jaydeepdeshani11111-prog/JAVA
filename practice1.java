import java.util.Scanner;
class practice1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the width");
		int w=sc.nextInt();
		System.out.println("Area of rectangle is "+(l*w));
	}
}