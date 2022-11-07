package Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forLoop_task1 {

	public static void main(String[] args) {
// Write a program which can store List of Integer values and print all the values using for loop.
     //List<Integer> values=new ArrayList<>();
    /*
     values.add(10);
     values.add(20);
     values.add(30);
     values.add(40);
     values.add(50);
     values.add(60);
     values.add(70);
     values.add(80);
     values.add(90);
     System.out.println(values);
     */
		
     List<Integer> values=Arrays.asList(100,200,300,400,550,123,123,156,87,678);
     for(int i=0;i<values.size();i++){
    	 System.out.println(values.get(i));
     }
     
	}

}
