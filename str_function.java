import java.lang.String.*;
class str_function
{
	public static void main(String args[])
	{
		String str="Rajkot";
		int i=str.length();
		System.out.println(i);
		
		System.out.println(str.concat("Gujarat"));
		
		char c=str.charAt(3);
		System.out.println(c);
		
		String stt="Atmiya";
		int ans=stt.compareTo("atmiya");
		System.out.println(ans);
		
		String st="Atmiya";
		int ans1=st.compareToIgnoreCase("atmiya");
		System.out.println(ans1);
		
		String s4="Atmiya";
		char c3[]=new char[10];
		c3=s4.toCharArray();
		System.out.println(c3);
		
		String s1,s2;
		s1="atmiya";
		s2=s1.toUpperCase();
		System.out.println(s2);
		
		s2=s1.toLowerCase();
		System.out.println(s2);
		
		s2=s1.substring(3,5);
		System.out.println(52);
		
		s1="atmiya";
		s2=s1.replace('a','A');
		System.out.println(52);
		
		int index=str.indexOf("a");
		System.out.println(index);
		
		int index1=s1.indexOf("a",2);
		System.out.println(index1);
		
		String str1="Hello";
		String str2="hello";
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String s="Atmiya";
		System.out.println(s.startsWith("At"));
		System.out.println(s.endsWith("ya"));
	}
}