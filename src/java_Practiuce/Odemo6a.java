package java_Practiuce;

public class Odemo6a 
{ 
	int x=4;//d1.x value
	A a1=new A();
	Odemo6a d1;//d1.d1


	public static void main(String[] args) 
	{
		System.out.println("main method start");
		Odemo6a d1 =new Odemo6a();
		System.out.println(d1.x);//4
		System.out.println(d1.d1);//null
		d1.d1=new Odemo6a();
		d1.d1.d1=new Odemo6a();
		
		System.out.println(d1.d1.d1);//address
		System.out.println(d1.d1.d1.d1);//null
		
		int x=6;
		d1.d1.d1.x=x;
		d1.d1.d1.d1=d1;
		
		System.out.println(d1.d1.d1.d1);//address
		System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.x);//4
		System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.d1);//address
		System.out.println(d1.d1.d1);//address

	}

}
