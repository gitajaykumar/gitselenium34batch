package java_Practiuce;

public class StaticDemo5 
{
	int a=10;
	static int b=20;

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		StaticDemo5 s1=new StaticDemo5();
		System.out.println("Done");

	}
	int funA()
	{
		System.out.println("funA of StaticDemo5");
		return 10;
	}
	static int funB()
	{
		System.out.println("funB of StaticDemo5");
		return 20;
	}

}
