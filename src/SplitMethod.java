
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Splitting based on space
		
		String s1="The world is flying";
		String[] s2=s1.split("\\s+");
		for(String s3:s2)
		{
			System.out.println(s3);
		}
		//splitting based on @
		String s4="The@#$world @#$is )(flying";
		String[] s5=s4.split("\\@");
		for(String s6:s5)
		{
			System.out.println(s6);
		}
	}

}
