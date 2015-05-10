import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Challenge4 {
	
	public static String findHighestPossibleNumber(List<Integer> list){
		List<Integer> actualNumbers = createActualNumbersFromList(list);
		 HashMap<Integer, Integer> map = createMapFromList(list);
		Collections.sort(actualNumbers);
		String result="";
		for (Integer integer : actualNumbers) {
			result=map.get(integer)+result;
		}
		return result;
	}
	
	public static HashMap<Integer,Integer> createMapFromList(List<Integer> list){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (Integer value : list) {
			char firstChar=(""+value.intValue()).charAt(0);
			int key=Integer.parseInt(""+firstChar);
			map.put(key, value);
			}
		return map;
	}
	
	
	public static List<Integer> createActualNumbersFromList(List<Integer> list){
		List<Integer> result=new ArrayList<Integer>();
		for (Integer value : list) {
			char firstChar=(""+value.intValue()).charAt(0);
			int key=Integer.parseInt(""+firstChar);
			result.add(key);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(2);
		list.add(1);
		list.add(9);
		System.out.println(findHighestPossibleNumber(list));
	}
}
