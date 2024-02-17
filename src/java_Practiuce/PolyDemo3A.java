package java_Practiuce;

public class PolyDemo3A 
{

	public static void main(String[] args) 
	{
		PolyDemo3A p1=new PolyDemo3A();
		p1.funA();
		p1.funA(10 ,20000l);
		p1.funA(10000l , 20);
		
		

	}
	void funA()
	{
		System.out.println("zero args of funA");
    }
	void funA(int a ,long b)
	{
		System.out.println("int a long b args of funA");
		
    }
	void funA(long a,int b)
	{
		System.out.println("long a int b args of funA");
		
		
	}
	
}
