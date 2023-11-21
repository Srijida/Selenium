package Day1;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Strawberry");
		list.add("Apple");
		list.add("Pineapple");
		System.out.println("List  value ="+list);
		Set<String>set=new HashSet<String>(list);
		System.out.println("Set value = "+set);
		
		
		

	}

}
