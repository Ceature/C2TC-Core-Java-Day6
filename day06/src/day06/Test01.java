package day06;

public class Test01 {
	protected int i=10;
	//to run this test03 program we have to convert from  private to protected the it will not throw any error
	protected void show() {
		System.out.println("Hello world!");
	}
	public static void main(String[ ] args) {
	Test01 t01=new Test01();
	t01.show();
	System.out.println(t01.i);
}
}
