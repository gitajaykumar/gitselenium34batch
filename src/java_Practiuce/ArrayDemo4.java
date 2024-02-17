package java_Practiuce;

public class ArrayDemo4 
{

	public static void main(String[] args) 
	{
		A k=new A();
		A arr[]=new A[5];
		arr[0]=new A();
		arr[1]=new A();
		arr[2]=k;
		arr[4]=new A();
		k.i=9;
		
		System.out.println(k);
		System.out.println(arr[2]);
		System.out.println(arr[2].i);
		arr[2].funA();

	}

}
