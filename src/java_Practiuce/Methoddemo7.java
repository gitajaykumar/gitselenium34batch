package java_Practiuce;

public class Methoddemo7 {

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		Methoddemo7 m1=new Methoddemo7();
          m1.funB();
          System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of Methoddemo7");
	}
	void funB(){
		{
			System.out.println("funB of Methoddemo7");
			Methoddemo7 m1=new Methoddemo7();
			m1.funA();
		}
	}

}
