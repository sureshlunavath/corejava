/*
 * polymorphism
 * overloading class
 * here test is a overloading class
 * method must be same
 * no. of parameters must be different
 * order of parameters should be different
 * return type does not matter
 * */
class test{
	void show() {
		System.out.println("show-1");
	}
	void show(int a) {
		System.out.println("show-2");
	}
	void show(String a,int b) {
		System.out.println("show-3");
	}
	void show(int a,int b) {
		System.out.println("show 4");
	}
	
}
public class overloadingdemo {
	public static void main(String[] args) {
		test obj1=new test();
		obj1.show(10,20);  //prints show 4 
		obj1.show();       //prints show-1
	}

}
