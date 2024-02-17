package java_Practiuce;

public class ConsDemo8A 
{
	int i=5;
	ConsDemo8A(int a)
	{
		System.out.println("cons of consDemo8A");
		a=i;
	}

	public static void main(String[] args) 
	{
		ConsDemo8A c1=new ConsDemo8A(20);
		System.out.println(c1.i);
		ConsDemo8A c2=new ConsDemo8A(30);
		System.out.println(c2.i);
		

	}

}
