package JavaSessiopn_Day2;

public class ExceptionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Exception");
		
		
		
		try {
			
			
		int num=100;
		
		int p=0;
		
		int res = num/p;
		
		System.out.println(res);
		}
		
		catch(ArithmeticException e) {
			System.out.println("test data");
		}
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[90]);
		}
		catch(Exception e1) {
			System.out.println("Working");
		}
		
		
		
		

	}

}
