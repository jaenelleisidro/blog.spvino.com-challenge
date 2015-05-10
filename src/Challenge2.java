import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Challenge2 {
	
	public static void printFibonaci(int maximumNumbers){
		System.out.println("0");
		System.out.println("1");
		System.out.println("1");
		BigInteger prevNumber=new BigInteger("0");
		BigInteger currentNumber=new BigInteger("1");
		BigInteger temp=new BigInteger("0");
		
		for(int ctr=1;ctr<=maximumNumbers;ctr++){
			temp=new BigInteger(currentNumber.toString());;
			currentNumber=currentNumber.add(prevNumber);
			prevNumber=new BigInteger(temp.toString());;
			System.out.println(currentNumber);
			
		}
		
	}
	
	public static void main(String[] args) {
		printFibonaci(100);
		
	}
}
