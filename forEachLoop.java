package Assignment_3;

import java.util.Arrays;
import java.util.List;

public class forEachLoop {

	public static void main(String[] args) {
/* Write a program which can store List of Integer values and print all the values using for for
		loop.
		*/
		
		List<Integer> values=Arrays.asList(10,15,20,25,30,35,40,45,50,55,60,65,70);
		for(Integer valueList:values){
			System.out.println(valueList);
		}

	}

}
