
public class string2 {

	public static void main(String[] args) {
		String str1=new String("abc");
		
		String str2="abc";
		
		String str3=new String("abc");
		
		String str4="abc";
		
		if(str2==str4) {
			System.out.println("true");
		}
		else {
			System.out.println("false");  //ans true,since refers to same string in string pool
		}
		
		
		if(str1==str2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");   //ans false,since refers to two different objects
		}
		
		if(str1.equals(str2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");   //ans true,since compares only values in them.
		}

	}

}
