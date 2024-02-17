package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo4 {

	public static void main(String[] args) 
	{
		HashSet<String> set1=new HashSet<String>();
        set1.add("selenium");
        set1.add("java");
        set1.add("api");
       Iterator<String> setlist =set1.iterator();
       
      String firstdata= setlist.next();
      System.out.println("firstdata:"+firstdata);
      
      String Seconddata= setlist.next();
      System.out.println("seconddata:"+Seconddata);
      
      String thirddata= setlist.next();
      System.out.println("thirddata:"+thirddata);
      
      
      String fourthdata= setlist.next();
      System.out.println("fourthdata:"+fourthdata);

	}

}
