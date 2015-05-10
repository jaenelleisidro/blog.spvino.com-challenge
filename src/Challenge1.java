import java.util.ArrayList;
import java.util.List;


public class Challenge1 {
	public static int sum1(List<Integer> numbers){
		int sum=0;
		for (Integer number : numbers) {
			sum=sum+number.intValue();
		}
		return sum;
	}
	public static int sum2(List<Integer> numbers){
		int sum=0;
		int ctr=0;
		while(ctr<numbers.size()){
			sum=sum+numbers.get(ctr);
			ctr++;
		}
		return sum;
	}
	public static int sum3(List<Integer> numbers){
		return sum3(numbers,0);
	}
	public static int sum3(List<Integer> numbers,int index){
		int sum=0;
		sum=sum+numbers.get(index);
		if(index<numbers.size()-1){
			index=index+1;
			sum=sum+sum3(numbers,index);
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		System.out.println(sum1(numbers));
		System.out.println(sum2(numbers));
		System.out.println(sum3(numbers));
		
	}
}
