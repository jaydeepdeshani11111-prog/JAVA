class car
{
	int modelyear;
	String modelname;
	car()
	{
		System.out.println("my car name is fortuner");
	}
	car(int year,String name)
	{
		modelyear=year;
		modelname=name;
	}
}
class overload_construct
{
	public static void main(String args[])
	{
		car c1=new car();
		car c2=new car(2024,"fortuner");
		System.out.println("model year:"+c2.modelyear+ "and model name:"+c2.modelname);
	}
}