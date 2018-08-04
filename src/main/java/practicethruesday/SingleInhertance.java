package practicethruesday;

public class SingleInhertance {
	{
		int salfather=12;
		/*public void display()
		{
			System.out.println("pri");
		}*/
	}

	//Child class
	class Karthick extends SingleInhertance
	{
		int salson=10;
		/*public void display1()
		{
			System.out.println("Son");
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karthick obj=new Karthick();
		
		System.out.println(obj.salson);;

	}}




