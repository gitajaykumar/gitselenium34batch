package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 
{

	public static void main(String[] args) 
	{
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("selenium", "java");
		map1.put("Apitesting", "postman");
		map1.put("cicdtool", "jenkins");
		System.out.println(map1.get("selenium"));
		int mapsize=map1.size();
		System.out.println("mapsize:"+mapsize);
		
		map1.put("selenium", "java and manual");
		map1.put("Apitesting", "restassured");
		map1.put("cicdtool", "bamboo");
		map1.put("versioncontrol", "Git");

		System.out.println(map1.get("selenium"));
        
		 mapsize=map1.size();
		System.out.println("mapsize:"+mapsize);
	}

}
