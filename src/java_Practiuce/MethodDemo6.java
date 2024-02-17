package java_Practiuce;

public class MethodDemo6 
{

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		//	m1.funA();
		MethodDemo6 m1=new MethodDemo6();
		m1.funB();
		System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of MethodDemo6");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo6");
		MethodDemo6 m1=new MethodDemo6();
		m1.funA();
	}

}
