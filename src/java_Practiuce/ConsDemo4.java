package java_Practiuce;

public class ConsDemo4 
{
	int a=10;
	ConsDemo4()
	{
		System.out.println("cons of ConsDemo4");
		a=15;
	}
	

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo4 c1 =new ConsDemo4();
		System.out.println(c1.a);
		System.out.println("Done");
	}

}
