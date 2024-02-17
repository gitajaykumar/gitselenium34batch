package java_Practiuce;

public class ThisDemo5 
{
	ThisDemo5()
	{
		this(20);
		System.out.println("Zero args of ThisDemo5");
	}
	ThisDemo5(int a)
	{
		System.out.println("int args of ThisDemo5" );
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("main method Start");
		ThisDemo5 t1=new ThisDemo5();
		System.out.println("Done");

	}

}
