class person
{
	String fname,lname;
	person(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
}
class student extends person
{
	int rollno;
	String stream;
	int sem;
	
	student(String fname,String lname,int rollno,String stream,int sem)
	{
		super(fname,lname);
		this.rollno=rollno;
		this.stream=stream;
		this.sem=sem;
	}
	void display()
	{
		System.out.println("Name:"+fname+""+lname);
		System.out.println("Rollno:"+rollno);
		System.out.println("Division:"+stream+"sem"+sem);
	}
}
class studdemo
{
	public static void main(String args[])
	{
		student sl=new student("jaydeep","deshani",05,"Bsc IT",3);
		sl.display();
	}
}