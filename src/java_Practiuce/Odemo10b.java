package java_Practiuce;

public class Odemo10b 
{
	A getA(int x)
	{
		A a1=new A();
		a1.i=x;
		a1.j=x+1;
		return a1;
	}

	public static void main(String[] args) 
	{
		Odemo10b d1 =new Odemo10b();
		A x=d1.getA(4);//address
		int a=d1.getA(7).i;
		int b=d1.getA(7).j;//8
		d1.getA(5).funA();
		d1.getA(7).funA();
		int c= d1.getA(7).i;
//		System.out.println(a);// 7 funA of classA
//		System.out.println(b);//8
//		System.out.println(c);//7
//		System.out.println(d1);//address
		System.out.println(x);
		System.out.println(x);
		System.out.println(d1.getA(4));
		System.out.println(d1.getA(4));
		System.out.println(d1.getA(4));
		//  System.out.println(d);
		//  System.out.println(d);
	}




}



