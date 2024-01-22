package JavaSession_Day4;

import java.util.StringTokenizer;

public class TestScenario_Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi All This is java sdet training day4";
		
		// Delimiter = " "
		
        StringTokenizer st = new StringTokenizer(str," ");	
        
     
        
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        
        
		
		

	}

}
