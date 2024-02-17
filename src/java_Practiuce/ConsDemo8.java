package java_Practiuce;

public class ConsDemo8 
{
	int a=5;
	ConsDemo8(int i)
	{
		System.out.println("cons of ConsDemo8 ");
		a=i;
	}

	public static void main(String[] args) 
	{
		ConsDemo8 c1=new ConsDemo8(20);
		System.out.println(c1.a);
		ConsDemo8 c2=new ConsDemo8(30);
		System.out.println(c2.a);



	}

}
