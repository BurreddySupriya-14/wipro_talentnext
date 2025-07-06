package java_fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Arrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {12,34,12,45,67,89};
		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr));
		System.out.println("original list: " +list);
		
		LinkedHashSet<Integer> element=new LinkedHashSet<>(list);
		
		ArrayList<Integer> finalList=new ArrayList<>(element);
		System.out.println("Final list: " +finalList);

	}

}