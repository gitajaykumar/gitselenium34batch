package java_Practiuce;

public class PolyDemo1 
{

	public static void main(String[] args) 
	{
		PolyDemo1 p1=new PolyDemo1();
		p1.funA();
		p1.funA(10);
		p1.funA(1000);
		p1.funA(10f);
		p1.funA(10.0);
		

	}
	void funA()
	{
		System.out.println("zero args of funA");
    }
	void funA(int a)
	{
		System.out.println("int a args of funA");
		System.out.println(a);
    }
	void funA(long b)
	{
		System.out.println("long b args of funA");
		System.out.println(b);
	}
	void funA(float f)
	{
		System.out.println("int a args of funA");
		System.out.println(f);
	}
	void funA(double d)
	{
		System.out.println("int a args of funA");
		System.out.println(d);
	}
	
}
