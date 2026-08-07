class Game
{
	void type()
	{
		System.out.println("Indoor and Outdoor");
	}
}
class cricket extends Game
{
	void type()
	{
		System.out.println("Outdoor game");
	}
}
class upcasting
{
	public static void main(String args[])
	{
		Game gm=new Game();
		cricket ck=new cricket();
		gm.type();
		ck.type();
		gm=ck;
		gm.type();
	}
}
