package Assignment_3;


import java.util.Arrays;
import java.util.List;

public class sumAndStoreList {

	public static void main(String[] args) {
		// Write a program which will print sum of all numbers which is stored in list
       List<Integer>listvalues=Arrays.asList(10,23,34,45);
       
       int sum=0;
       /*
       for(int i=0;i<listvalues.size();i++){
    	  sum +=listvalues.get(i);
    	  //System.out.println(sum);
    	  }
        System.out.println(sum);
       */
       for( Integer esum:listvalues){
    	   sum +=esum;
    	   //System.out.println(sum);
    	   }
       System.out.println(sum);
       
	}

}
