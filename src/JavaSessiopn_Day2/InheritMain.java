package JavaSessiopn_Day2;


class Test1{
	
	// class members
	int num;
	public void DispData(){
		String str="Hello world";
		System.out.println(str);
	}
	
	
	
}


class Test2 extends Test1{
	// class members + access the Test1 members
	
	public void testdata() {
		System.out.println("hello");
	}
	
	public void testThis() {
		this.DispData();
		this.num=100;
		System.out.println(num);
		//this.num=100;
		System.out.println(super.num);
	}
}

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 t1= new Test2();
		t1.DispData();
		t1.testdata();
		t1.testThis();
		

	}

}
