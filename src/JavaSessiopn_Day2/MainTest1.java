package JavaSessiopn_Day2;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create the object
		
		MethodDetails obj = new MethodDetails();
		
		StringBuffer res1 = obj.returnStrDemo();
		
		System.out.println(res1);
		
		
		obj.test123();
		
		obj.testparam(109, "test3"); // provide while calling the method

	}

}
