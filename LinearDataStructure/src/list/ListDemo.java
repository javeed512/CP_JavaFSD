package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {


		//duplicate , null are  allowed and insertion order is preserved
		
		//DS is growable array or dynamic array
		
		// initial capacity is 10
		List<Object>   list =     new ArrayList<Object>();
		
			list.add(100);
			list.add(4.555);
			list.add("hello");
			list.add(new ListDemo());
			list.add(100);
			list.add(null);
		
		System.out.println(list);

	}

}
