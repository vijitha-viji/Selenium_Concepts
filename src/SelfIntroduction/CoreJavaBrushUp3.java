package SelfIntroduction;

public class CoreJavaBrushUp3 {
	public static void main(String[] args) {
		 String s1 = "Rahul Shetty";
		 String s2 = "Rahul Sheety"; // Same memory allocation for s1 and S2
		 
		 String s3 = new String("welcome");
		 String s4 = new String("welcome"); // diff memo
		 
		 String s = "Rahul Shetty Academy";
		 
		 String[] splittedArray = s.split("Shetty");
		System.out.println(splittedArray[0]);
		System.out.println(splittedArray[1]);
		System.out.println(splittedArray[1].trim());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
