package collections;

import java.util.ArrayList;
import java.util.List;

public class Listdemo3 
{

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		list.add("selenium");
		list.add("java");
		list.add("Api testing");
		int listsize=list.size();
		System.out.println("listsize:"+listsize);

		list.add("selenium");
		list.add("java");
		list.add("Api testing");
		list.add("postman");
		listsize=list.size();
		System.out.println("listsize:"+listsize);
	}

}
