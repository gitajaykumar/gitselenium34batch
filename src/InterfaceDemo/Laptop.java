package InterfaceDemo;

public interface Laptop 
{
	public void copy();
	
	public void paste();
	
	public void security();
	
	public void keyboard();//1.7
	
	default  void date()//1.8
	{
		System.out.println("implement");
	}
	 static void audio ()
	 {
		 System.out.println("laptop audio");
	 }
	 
	 
		 
	 }
	


	
		
	


