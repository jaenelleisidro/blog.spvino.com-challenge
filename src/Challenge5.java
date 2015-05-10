import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Challenge5 {
	
	
	
	String defaultNumber="123456789";
	public static String findPossibleAnswer(){
		System.out.println(alternateMerger("123456789"," ++ - "));
		return null;
	}
	
	
	String alphabet=" -+";
	int baseLength=defaultNumber.length();
	static int base=3;
	public static String generateBase(long seed){
		int powerStartingPoint=0;
		
		while(Math.pow(base,powerStartingPoint)<seed){
			powerStartingPoint=powerStartingPoint+1;
		}
		
		seed/Math.pow(base,powerStartingPoint);
		
		
		return powerStartingPoint+"";
	}
	
	public static String alternateMerger(String text1,String text2){
		String result="";
		for (int ctr=0;ctr<text1.length();ctr++) {
			result=result+text1.charAt(ctr);
			if(ctr<text2.length() && text2.charAt(ctr)!=' '){
				result=result+text2.charAt(ctr);
			}
		}
		return result;
	}
	
	
	
	
	public static void evaluate(String equation){
		 ScriptEngineManager manager = new ScriptEngineManager();
		    ScriptEngine engine = manager.getEngineByName("js");        
		    try {
				Object result = engine.eval(equation);
				if(result.toString().equals("100")){
				System.out.println(result);
				}
			} catch (ScriptException e) {
				System.out.println("Error : "+equation);
			}
	}

	
	public static void main(String[] args) {
		System.out.println(generateBase(77));
	}
}
