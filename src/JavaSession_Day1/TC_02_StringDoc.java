package JavaSession_Day1;

public class TC_02_StringDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val1="We are in SDET training";
		
		String val2="Hello Automation - Selenium";
		
		String a = "Test1"; // ASCII
		String b="TEst1";
		
		
		
		
		String res1 = val1.concat(val2);
		System.out.println(res1);
		
		
		char ch1=val1.charAt(5);
		System.out.println(ch1);
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("same values");
		}
		else {
			System.out.println("different");
		}
		
		
		

	}

}
