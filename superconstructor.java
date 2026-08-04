class mountain
{
	mountain()
	{
		System.out.println("I am superclass constructor mountain");
	}
}
class himalaya extends mountain
{
	himalaya()
	{
		super();
		System.out.println("I am the himalaya mountain");
	}
}
class superconstructor
{
	public static void main(String args[])
	{
		himalaya h=new himalaya();
	}
}