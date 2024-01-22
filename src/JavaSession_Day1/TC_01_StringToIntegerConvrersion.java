package JavaSession_Day1;

public class TC_01_StringToIntegerConvrersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultval = "346756";
		
		String value = "4567.99876";  // Decimal
		
		double res2=9898.9087;
		
		System.out.println(resultval);
		
	   int resultint=Integer.parseInt(resultval);
	   System.out.println(resultint);
	   
	   double val1 = Double.parseDouble(value);
	   
	   System.out.println(val1);
	   
	   System.out.printf("%.3f",res2);

	}

}
