package JavaSessiopn_Day2;

public class MethodDetails {
	
	
	public StringBuffer returnStrDemo() {
		
		String strval = "Hello how are you all !";
		
		StringBuffer sb = new StringBuffer(strval);
		StringBuffer result = sb.reverse();
		return result;
		
	}
	
	
	public void test123() {
		System.out.println("This is a no return type method");
		System.out.println("It will never return the result");
	}
	
	public void testparam(int roll, String mnm) {
		String firstnm = "Pallavi";
		String lastnm = "Purohit";
		System.out.println(firstnm + " " + lastnm);
	}

}
