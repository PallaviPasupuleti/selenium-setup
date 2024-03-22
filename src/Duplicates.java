import java.util.ArrayList;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst=new ArrayList<>();
		List<Integer> duplicates=new ArrayList<>();
		List<Integer> Unique=new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(1);
		lst.add(2);
		lst.add(5);
		for(int i=0;i<lst.size();i++)
		{
			int currentvalue=lst.get(i);
			if(lst.subList(i+1,lst.size()).contains(currentvalue)||duplicates.contains(currentvalue))
			{
				if(!duplicates.contains(currentvalue))
				{
				duplicates.add(currentvalue);
				}
			}
			else
			{
				Unique.add(currentvalue);
			}
	
		}
		System.out.println(duplicates);
		System.out.println(Unique);
	}

}
