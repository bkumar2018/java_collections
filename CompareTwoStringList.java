package Collection_Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareTwoStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> data1 = new ArrayList<>();
		data1.add("QA"); 
		data1.add("test1");
		data1.add("test2");
		
		//List<String> data2 = new ArrayList<>(data1);
		
		List<String> sorteddata1 = new ArrayList<>(data1); 
		sorteddata1.sort(Comparator.reverseOrder());
		
		System.out.println(data1);
		System.out.println(sorteddata1);
		
		if(data1.equals(sorteddata1)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}

		List<String> sorteddata2 = new ArrayList<>(data1); 
		sorteddata2.sort(Comparator.naturalOrder());
		System.out.println(data1);
		System.out.println(sorteddata2);
		
		if(data1.equals(sorteddata2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	}

}
