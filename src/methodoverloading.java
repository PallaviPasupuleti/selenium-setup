
public class methodoverloading {

	public int add(int x,int y)
	{ 
		int z=x+y;
		return z;
	}
	public double add(double x,double y)
	{
		double z=x+y;
		return z;
	}
	public static void main(String[] args)
	{
		methodoverloading mo=new methodoverloading();
		System.out.println(mo.add(2,3));
	//	System.out.println(mo.add(1,2,3));
		System.out.println(mo.add(2.1,3.1));
		
	}
	
	}