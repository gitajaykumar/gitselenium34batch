package java_Practiuce;

public class Odemo8b 
{
	void fun1(A a1)
	{
		System.out.println(a1);//address
		if(a1!=null)
		{
			a1.i=a1.i+1;
			a1.j=a1.j+2;
		}
		System.out.println("end of fun1");
	}

	public static void main(String[] args) 
	{
		Odemo8b d1=new Odemo8b();
	//	A a1 =new A(); 
	//	d1.fun1(a1);
		
		int a1=10;
		A k =new A();
		d1.fun1(k);
		System.out.println(k.i);
		System.out.println(k.j);
		System.out.println(a1);
		
	//	System.out.println(a1.i);//1
	//	System.out.println(a1.j);//2
		

	}

}
