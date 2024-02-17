package testNGDemo;

import org.testng.annotations.Test;

public class TestngGroupsDemo1 
{
	@Test(groups = "sanity")
	public void funA()
	{
		System.out.println("funA of TestngGroupsDemo1");
	}
	@Test(groups = "sanity")
	public void funB()
	{
		System.out.println("funB of TestngGroupsDemo1");
	}
	@Test(groups = "regression")
	public void funC()
	{
		System.out.println("funC of TestngGroupsDemo1");
	}
	@Test(groups = "regression")
	public void funD()
	{
		System.out.println("funD of TestngGroupsDemo1");
	}

}
