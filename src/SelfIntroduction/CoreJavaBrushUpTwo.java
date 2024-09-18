package SelfIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUpTwo {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6,90,21,33,11};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				System.out.println(arr[i]+ " is not a multiplier of 2");
			}
			
		}
		int[] numbers = {1,3,45,12,11};
	      
	    ArrayList<String> a = new ArrayList<String>();
	    a.add("Venba");
	    a.add("Vasu");
	    a.add("amma");
	    a.add("Selenium");
	    a.add("Pattu");
	    System.out.println(a.get(2));
	    
	    for(int i=0;i<a.size();i++)
	    {
	    	System.out.println(a.get(i));
	    }
	    System.out.println("*****************");
	    for(String val: a)
	    {
	    	System.out.println(val);
	    }
	    System.out.println(a.contains("Venb"));
	    String[] name = {"Venba", "Vasu", "Viji"}; // Convert this string to array list
	    List<String >nameArrayList = Arrays.asList(name);
	    System.out.println(nameArrayList.contains("Venba"));
	    
	    
	}

}
