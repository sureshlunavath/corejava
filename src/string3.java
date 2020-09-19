
public class string3 {

	public static void main(String[] args) {
		String str1="abc"+"xyz"+new String("123");   //6*6=36 bytes
		System.out.println(str1);
		
		StringBuffer sb=new StringBuffer("abc"); //1+1 objects
		sb.append("xyz");
		sb.append("123");
		
		System.out.println(str1);
		
		/*
		 * 1. new String("abc")  1 object
		 * 2. new String("xyz")  1 object
		 * 3. new String("abcxyz")  1 object
		 * 4. new String("123")  1 object
		 * 5. abcxyz123  1 object
		 * 6. new String("abcxyz123")  1 object
		 * 
		 *total 6 objects are created
		 */

	}

}
