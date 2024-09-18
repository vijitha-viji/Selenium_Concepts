package SelfIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamsTest {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Venba");
		names.add("Vasu");
		names.add("Viji");
		names.add("Yogi");
		names.add("Vedanth");
		names.add("MAdhu");
		names.add("Naaty");
		int count =0;
		for(int i=0; i<names.size();i++)
		{
			String actual =names.get(i);
			if(actual.startsWith("V"))
			{
				count++;
				
			}
			
		}
		System.out.println(count);	
			
	long c=  names.stream().filter(s->s.startsWith("V")).count();
	System.out.println(c);
	
	long d = Stream.of("Venba","Vasu","Viji","Yogi","Vedanth").filter(s->
	{
	   s.startsWith("V");
	   return true;	
	}).count();
	System.out.println(d);
	
//// 
	System.out.println("****");
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	System.out.println(">4 Limit 1");
	
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	System.out.println("End with Letter 'A'");
	
	Stream.of("Venba","Viji","Vasu","Natya").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	.forEach(s-> System.out.println(s));
	
	System.out.println("Print in upper case and sorted");
	
	List<String> names1 = Arrays.asList("Adam","Rahul","Shetty");
	names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	System.out.println("Concat 2 lists of stream");
	Stream<String> newStream= Stream.concat(names.stream(), names1.stream());
	newStream.sorted().forEach(s->System.out.println(s));
	
System.out.println("Get the names in the list and print ");
boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Shetty"));
System.out.println(flag);  
Assert.assertTrue(flag);  // this fails
	
	List<String> ls= Stream.of("Selenium", "Automation", "Zoho", "Interiew").filter(s->s.endsWith("o")).map(s->s.toUpperCase())
	.collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	System.out.println("Print unique number in array");
	List<Integer> values=  Arrays.asList(3,2,4,5,1,2,5,6,7,8);
	values.stream().distinct().forEach(s-> System.out.println(s));
	
	System.out.println("Sort the Array");
	List<Integer> li =values.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(li.get(1));
	System.out.println("Find any match in the list");
	
	
	
	
	
	
	}

}
