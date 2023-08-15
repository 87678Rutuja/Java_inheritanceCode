class Parent{
	int x = 10;
	Parent(){
		System.out.println("In Parent Constractor");
	}
	void access(){
		System.out.println("Parent Instance");
	}
}
class Child extends Parent{
	int y = 20;
	Child(){
		System.out.println("In Child Constractor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[] ar){
		Child obj = new Child();
		obj.access();
	}
}

