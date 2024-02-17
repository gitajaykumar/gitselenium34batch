package java_Practiuce;

public class PolyDemo2 
{

	public static void main(String[] args) 
	{
		PolyDemo2 p1=new PolyDemo2();
		p1.funA();
		p1.funA(10);
		p1.funA(10 , 20);
		
		

	}
	void funA()
	{
		System.out.println("zero args of funA");
    }
	void funA(int a)
	{
		System.out.println("int a args of funA");
		
    }
	void funA(int a,int b)
	{
		System.out.println("long b args of funA");
		
	}
	
}
