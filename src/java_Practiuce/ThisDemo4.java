package java_Practiuce;

public class ThisDemo4 
{
	ThisDemo4()
	{
		System.out.println("Zero args of ThisDemo4");
	}
	
	
	ThisDemo4(int a)
	{
		this ();
		System.out.println("int args of ThisDemo4");
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ThisDemo4 t1=new ThisDemo4(20);
		System.out.println("Done");

	}

}
