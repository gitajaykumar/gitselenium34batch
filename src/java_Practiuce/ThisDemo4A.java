package java_Practiuce;

public class ThisDemo4A 
{
	int a=5;
	ThisDemo4A()
	{
		System.out.println("Zero args of ThisDemo4A");
		a=15;
	}
	ThisDemo4A(int i)
	{
		this();
		System.out.println("int args of ThisDemo4A");
		a=i;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method Start");
		ThisDemo4A t1=new ThisDemo4A(20);
		System.out.println(t1.a);
		System.out.println("Done");

	}

}
