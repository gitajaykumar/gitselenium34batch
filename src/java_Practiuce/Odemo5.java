package java_Practiuce;

public class Odemo5 
{
	int x=1;
	A a1=new A();
	void fun1()
	{
		x=x+1;//1+1=2
		a1.i=a1.i+x;//1+4=5
	}


	public static void main(String[] args) 
	{
		Odemo5	 d1=new Odemo5();
		d1.x=d1.x+2;//2+2=4
		d1.a1.i=d1.a1.i+1;//0+1=1
		d1.fun1();
		System.out.println(d1.a1.i);
		System.out.println(d1.x);


	}

}
