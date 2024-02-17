package java_Practiuce;

public class ThisDemo5A 
{
	int a=5;
	ThisDemo5A()
	{
		this(20);
		System.out.println("Zero args of ThisDemo5A");
		a=15;
	}
	ThisDemo5A(int i)
	{
		System.out.println("int args of ThisDemo5A" );
		a=i;
	}
	public static void main(String[] args) 
	{

		System.out.println("main method Start");
		ThisDemo5A t1=new ThisDemo5A();
		System.out.println(t1.a);
		System.out.println("Done");

	

	}

}
