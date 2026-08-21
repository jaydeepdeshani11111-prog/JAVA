class multiple_catch
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
			a[5]=30/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException occurs");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
	}
}