package java_Practiuce;

public class PolyDemo4 
{

	public static void main(String[] args) 
	{
		PolyDemo4 p1=new PolyDemo4();
		A s=new A();
		p1.funA(s);
		p1.funA(new A());
		//p1.funA(null);
		s=null;

		B r=new B();
		p1.funA(r);
		p1.funA(new B());
		//p1.funA(null);
		//r=null;
		
		C l=new C();
		p1.funA(l);
		p1.funA(new C());
		//p1.funA(null);
    // l=null;


	}
	void funA()
	{
		System.out.println("zero args of funA");
		System.out.println();
	}
	void funA(A a1)
	{
		System.out.println("A of args of funA");
		System.out.println();

	}
	void funA(B b1)
	{
		System.out.println("B of args of funA");


	}
	void funA(C c1)
	{
		System.out.println("c of args of funA");
		System.out.println();
	}

}
