package class_cast_exception;

public class Driver {

	public static void main(String[] args) {
		A a=new B(); //upcasting
		B b=(B) a; //downcasting
		System.out.println(b.j);
		
		
		A a1=new B();
		C c=(C) a1;
		System.out.println(c.k);  //here we get class cast exception


	}

}
