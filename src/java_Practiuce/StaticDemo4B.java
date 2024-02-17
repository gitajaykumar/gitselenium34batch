package java_Practiuce;

public class StaticDemo4B 
{

	public static void main(String[] args) 
	{
		//bad practice
		StaticDemo3 s1=new StaticDemo3();
		System.out.println(s1.i);
		System.out.println(s1.j);
		s1.a1.funA();
		
		

	}

}
