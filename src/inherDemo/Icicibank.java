package inherDemo;

public class Icicibank extends Rbibank
{
	Icicibank()
	{
		System.out.println("cons of Icicibank");
	}

	public static void main(String[] args) 
	{
		
		Icicibank i1=new Icicibank();
		i1.cbillscore();
	}

}
