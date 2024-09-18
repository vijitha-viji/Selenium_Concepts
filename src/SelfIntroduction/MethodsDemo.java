package SelfIntroduction;

public class MethodsDemo {
public static void main(String[] args) {
	MethodsDemo md = new MethodsDemo();
	//md.getData();
	String name = md.getData();
	System.out.println(name);
	getData2();
	MethodsDemo2 md2 = new MethodsDemo2();
	md2.methods2();
	
	
}

public String getData()
{
	System.out.println("Get Data Method");
 return "Rahul shetty";
 
}

public static String getData2()
{
	System.out.println("getDate 2");
  return "getData2";
  
}
}
