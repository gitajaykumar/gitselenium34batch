package java_Practiuce;

public class Test10 
{
	int minbalance;
	

	public static void main(String[] args) 
	{
		Test10 t1=new Test10();
		int minbalance  =t1.getbalance();
		System.out.println(minbalance);

	}
	int getbalance()
	{
		System.out.println("funA of test10");
		minbalance=2000;
		return minbalance;
	}

}
