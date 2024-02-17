package java_Practiuce;

public class ConsDemo7 
{
	ConsDemo7(int a)
	{
		System.out.println("cons of ConsDemo7");
		
	}
	ConsDemo7()
	{
		System.out.println("zero cons");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		
	//	ConsDemo7 c1=new ConsDemo7();//compile time error 
		ConsDemo7 c2=new ConsDemo7(10);
		System.out.println("Done");

	}

}
