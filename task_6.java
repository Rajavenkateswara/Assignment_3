package Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_6 {

	public static void main(String[] args) {
	/*Create a list of numbers 33,44,55,66,77,88 and perform below operation
	Remove second element from list using index
	Remove second element from list using value
	Add 90 at index 3
	Get the length of list
	Print all values from list using any values
	Convert List into array.
*/
		
		List<Integer> num=new ArrayList<>();
		num.add(33);
		num.add(44);
		num.add(55);
		num.add(66);
		num.add(77);
		num.add(88);
		System.out.println(num);
		System.out.println("***************************");
		//List<Integer>num=Arrays.asList(33,44,55,66,77,88);
		System.out.println("Size of the list is: " +num.size());
		System.out.println("***************************");
		//Remove second element from list using index
		
		System.out.println(num.remove(1));
		System.out.println(num);
		System.out.println("***************************");
		//Remove second element from list using value
		System.out.println(num.remove(Integer.valueOf(44)));
		System.out.println(num);
		System.out.println("***************************");
		//Add 90 at index 3
		num.add(3, 90);
		System.out.println(num);
		System.out.println("***************************");
		//Get the length of list
		System.out.println(num.size());
		System.out.println("***************************");
		//Print all values from list using any values
		for(Integer number:num){
			System.out.println(number);
		}
		//Convert List into array.
		int myarray[]=new int [num.size()];
		System.out.println("***************************");
		for(int i=0;i<myarray.length;i++){
			myarray[i]=num.get(i);
			System.out.println(myarray[i]);
		}
		

	}

}
