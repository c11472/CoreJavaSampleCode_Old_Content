package JavaSession_Day1;

public class Tc_04_CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val = "We are in day 2 of java session"; // 8 // space
		
		String starr[] = val.split(" ");
		
		for(String i:starr) {
			System.out.println(i );
			
		}
		
		int count1=starr.length;
		System.out.println("No of words are:" + count1);
		
		
		

	}

}
