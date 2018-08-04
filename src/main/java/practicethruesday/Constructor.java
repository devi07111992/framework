package practicethruesday;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DEFAULT CONSTRUCTOR
		ABC obj=new ABC();
		ABC obj1=new ABC(7);
	}

}
class ABC
{
	public ABC()
	{
		System.out.println("DEFAULT CONSTRUCTOR");
	}


	public ABC(int i)
	{
		System.out.println("one parameter");

	}}
