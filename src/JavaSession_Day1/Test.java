package JavaSession_Day1;


class Test1{
	
	public int CalculateWords() {
        String val = "We are in day 2 of java session"; // 8 // space
		
		String starr[] = val.split(" ");
		
		for(String i:starr) {
			System.out.println(i );
			
		}
		
		int count1=starr.length;
		System.out.println("No of words are:" + count1);
		
		return count1;
		
		
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test1 obj = new Test1();
		
		int res = obj.CalculateWords();
		
		System.out.println(res);

	}

}
