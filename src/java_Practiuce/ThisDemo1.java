package java_Practiuce;

public class ThisDemo1 
{
	ThisDemo1()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		ThisDemo1 t1=new ThisDemo1();
		System.out.println(t1);
		
		ThisDemo1 t2=new ThisDemo1();
		System.out.println(t2);
		
		ThisDemo1 t3=new ThisDemo1();
		System.out.println(t3);
		

	}

}
