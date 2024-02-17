package java_Practiuce;

public class ConsDemo6 
{
	int a=10;
	ConsDemo6()
	{
		System.out.println("cons of ConsDemo6");
		int i=15;
		a=i;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo6 c1 =new ConsDemo6();
		System.out.println(c1.a);
		System.out.println("Done");

	}

}
