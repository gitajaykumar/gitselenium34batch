package collections;

import java.util.ArrayList;
import java.util.List;

public class Listdemo4 
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();//wrong practice
		list.add(10);
		list.add(true);
		list.add("selenium");
		   Object o1  =list.get(0);
		   System.out.println(o1);
		
		List<String>list1=new ArrayList<String>();
		list1.add("selenium");
		list1.add("java");
		list1.add("Api testing");
		String s1=list1.get(0);
		System.out.println(s1);
		
        List<Integer>list2=new ArrayList<Integer>();
        list2.add(10);
		list2.add(20);
		list2.add(30);
		Integer i1	=list2.get(0);
		System.out.println(i1);
		
        List<Boolean>list3=new ArrayList<Boolean>();
        list3.add(true);
		list3.add(true);
		list3.add(false);
		Boolean b1=	list3.get(0);
		System.out.println(b1);
	}

}
