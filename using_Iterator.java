package Assignment_3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class using_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program which can store List of Integer values and
		 *  print all the values using for iterator
		 */

		List<Integer> values=Arrays.asList(5,10,123,123,435,542,145,6785,346);
		Iterator<Integer> itr=values.iterator();
		while(itr.hasNext()){
			Integer valuesList=itr.next();
			System.out.println(valuesList);
			
		}
	}

}
