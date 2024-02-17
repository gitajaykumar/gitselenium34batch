package java_Practiuce;

public class Odemo2 
{
	int x;
	int y;
	void fun1()
	{
		x=x+1;
		Odemo2 d1=new Odemo2();
		d1.x=x+2;
		System.out.println(d1.x);
	}
	

	public static void main(String[] args) 
	{
		Odemo2 d1=new Odemo2();
		d1.fun1();
		System.out.println(d1.x);

	}

}
