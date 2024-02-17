package java_Practiuce;

public class StaticDemo2 
{
	int i=10;
	static  int j=20;

	public static void main(String[] args) 
	{
		StaticDemo2 s1=new StaticDemo2();
		System.out.println(s1.i);//10
		
		int i=30;
		System.out.println(i);//30
		
		System.out.println(j);//20
		
		j=40;
		System.out.println(j);//40
		

	}

}
