
public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings are immutable(unchangeable). Strings are created in string constant pool. Before creating a new string it will search in
		//String constant pool whether the name is present or not. If that was present it will use the same one.
		String name="Vinya";
		String name1="Vinya";
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		if(name==name1)
		{
			System.out.println("Both are equal");
		}
		else
			System.out.println("not equal");
		
		StringBuffer sb=new StringBuffer("Vinya");
		StringBuffer sb1=new StringBuffer("Vinya");
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		if(sb.equals(sb1))
		{
			System.out.println("Both are equal");
		}
		else
			System.out.println("not equal");

	}

}
