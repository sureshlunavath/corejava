//constructors are nothing but methods which should contain same name as that of class.
public class test2 {
	public test2() {     //constructor1
		this(20);					//matches to t-2 and takes execution there,after execution returns.Always must be in first line.
		System.out.println("t-1");
	}
	public test2(int a) {     //constrctor2
		this(20,40);				//matches to t-3 and takes execution there.Always must be in first line.
		System.out.println("t-2");
	}
	public test2(int a,int b) { //constructor3
		System.out.println("t-3");   //if we have 3 constructors,then 2 this(),can only be used.no loop can be created
	}
	
	public static void main(String[] args) {
		//test2 obj=new test2(20);  //matches to t-2
		test2 obj1=new test2(); //matches to t-1
		//test2 obj2=new test2(20,40); //matches to t-3
	}

}
