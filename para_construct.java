class fruits
{
	String fruits_nm;
	fruits(String f_nm)
	{
		fruits_nm = f_nm;
	}
}
class para_construct
{
	public static void main(String args[])
	{
		fruits f1=new fruits("Mango");
		System.out.println("fruit name:"+f1.fruits_nm);
	}
}