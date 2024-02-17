package collections;

import java.util.HashSet;

public class SetDemo3 {

	public static void main(String[] args) 
	{
		HashSet<String> set1=new HashSet<String>();
           set1.add("selenium");
           set1.add("java");
           set1.add("api");
           
          int setsize  =set1.size();
          System.out.println(setsize);
          
          set1.add("selenium");
          set1.add("java");
          set1.add("api");
          set1.add("core");
          int setsize1  =set1.size();
          System.out.println(setsize1);

	}

}
