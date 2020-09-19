import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //scanner to take input
		System.out.println("enter any string to reverse:");
		String str=sc.next();    //to take input from user
		
		//method -1 to reverse a string
		//StringBuffer sb=new StringBuffer(str); // string buffer class to reverse the string
		
		//System.out.println(sb.reverse());
		
		//method -2 to reverse a string
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
