class Counter_Demo
{
	static int count=0;
	Counter_Demo()
	{
		count++;
		System.out.println(count);
	}
public static void main(String args[])
	{
	Counter_Demo c1=new Counter_Demo();
	Counter_Demo c2=new Counter_Demo();
	Counter_Demo c3=new Counter_Demo();
	}
}
