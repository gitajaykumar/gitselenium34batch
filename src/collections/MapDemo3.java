package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) 
	{
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("selenium", "java");
		map1.put("Apitesting", "postman");
		map1.put("cicdtool", "jenkins");
	    int listsize=map1.size();
	    System.out.println("listsize:"+listsize);
	    
	    map1.put("selenium", "java");
		map1.put("Apitesting", "postman");
		map1.put("cicdtool", "jenkins");
		map1.put("versioncontrol", "git");
        listsize=map1.size();
	    System.out.println("listsize:"+listsize);
	    
	    

	}

}
