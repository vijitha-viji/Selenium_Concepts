package SelfIntroduction;

public class CoreJavaBrushUp {
	public static void main(String[] args) {
		int myNum = 5;
		String website = "RahulShettyAcademy";
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNum + " is the numer");
		
		int[] arr = new int[5];
		arr[0]= 12;
		arr[1] = 11;
		arr[2] = 10;
		arr[3]= 9;
		arr[4]=8;
		System.out.println(arr[0]);
		
		int[] arr2 = {1,3,45,35,12};
	
	for(int i=0 ; i<arr.length; i++)
        {
		  System.out.println(arr[i]);
		}
	
	
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
	
	String[] name = {"Venba", "Vasu", "Viji"};
	for(int i=0;i<name.length;i++)
	{
		
		System.out.println(name[i]);
	}

	 for (String s:name) {
		 System.out.println(s);
	 }
}
}