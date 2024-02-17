package testNGDemo;

import org.testng.annotations.Test;

public class TestngDemo1 
{

	public static void main(String[] args) 
	{
		System.out.println("main method of TestngDemo1");
		
     }
	
	@Test
	public void funA()
	{
		System.out.println("funA of TestngDemo1");
	}

}
