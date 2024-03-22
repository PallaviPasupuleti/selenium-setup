import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>();
		List<Integer> lst2=new ArrayList<>();
		List<Integer> lst3=new ArrayList<>();
		//HashSet<object> lst2=new HashSet<object>();
		//ArrayList<Integer> lst3=new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(1);
		lst.add(2);
		lst.add(5);
		lst.add(6);
		
		for(int x=0;x<lst.size();x++) {
			int currentvalue=lst.get(x);//1,2,3,1
			if(lst.subList(x+1, lst.size()).contains(currentvalue)||lst2.contains(currentvalue))
			{
				if(!lst2.contains(currentvalue))
				{
					lst2.add(currentvalue);//1
				}
			}
				else
				{
					lst3.add(currentvalue);
				}
			}
		System.out.println(lst2);
		System.out.println(lst3);
		//System.out.println(lst3);
	}

}