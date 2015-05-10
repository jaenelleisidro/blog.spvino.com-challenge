import java.util.ArrayList;
import java.util.List;


public class Challenge3 {
	
	public static List<String> alternateMerger(List<String> list1,List<String> list2){
		List<String> result=new ArrayList<String>();
		for (int ctr=0;ctr<list1.size();ctr++) {
			result.add(list1.get(ctr));
			result.add(list2.get(ctr));
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		List<String> list2=new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		
		List<String> result = alternateMerger(list1, list2);
		for (String string : result) {
			System.out.println(string);
		}
		
	}
}
