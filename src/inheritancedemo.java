class grandparent{ //class
	void delete() {
		System.out.println("G-Delete");
	}
}
class parent extends grandparent{
	public parent() { //constructor
		System.out.println("p-constructor");
	}
	void show() {
		System.out.println("p-show");
	}
	void display() {
		System.out.println("p-display");
	}
}
class child extends parent{ //extend copies the parent class to a child class
	public child() {
		System.out.println("c-constructor");
	}
	void insert() {
		System.out.println("c-insert");
	}
}
//constructor is executed first,than method.
public class inheritancedemo {

	public static void main(String[] args) {
		child obj=new child();  //obj is created to acces child class materials.
		obj.show();		//can access our parent class methods
		obj.display(); //can access our parent class methods
		obj.insert(); //can also access our child class methods
		obj.delete(); ////can also access our grandparent class methods
		
		parent p=new parent(); //cannot call child class methods,since parent knows only grandparent.
		p.display();
		p.delete();
		p.show();
		
		grandparent gp=new grandparent(); //can call only its methods,cannot call parents or childs methods..
		gp.delete();  
	}

}

/*
 * Inheritance
 * 1.single inhertitance(1 parent,1 child)
 * 2.multilevel inhertitance (base class(grandfather),intermediate class(father), child class)
 * 1.multiple inhertitance
 * 1.hierarchieal inhertitance*/
