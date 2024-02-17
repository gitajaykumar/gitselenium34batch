package java_Practiuce;

public class ConsDemo9 
{
	int a=5;
	int b=10;
	ConsDemo9(int i,int j)
	{
		a=i;
		b=j;
	}

	public static void main(String[] args) 
	{
		ConsDemo9 c1=new ConsDemo9(20,30);
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}
