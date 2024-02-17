package java_Practiuce;

public class StaticDemo1 
{
	static StaticDemo1 s1=new StaticDemo1();

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		StaticDemo1 s1=new StaticDemo1();
		System.out.println("Done");

	}

}
