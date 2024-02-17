package java_Practiuce;

public class StaticVariableDemo1 
{

	public static void main(String[] args) 
	{
		funA(10);
		funB(10000);
		funC( (float) 10.23 );
		funD(10.23);
		funE(true);
		



	}
	static int funA(int a)
	{
		return a;
	}
	static long funB(long l1)
	{
		return l1;
	
	}
	static float funC(float f)
	{
		return f;
	}
	static double funD(double d)
	{
		return d;
	}
	static boolean funE(boolean b1)
	{
	return b1;	
	}
}
