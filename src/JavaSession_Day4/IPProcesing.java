package JavaSession_Day4;

import java.util.StringTokenizer;

public class IPProcesing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ip = "192.167.89.16"; // split will not work
		
		StringTokenizer st1 = new StringTokenizer(ip,".");
		
		
		System.out.println(st1.countTokens());
		
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}
		
		

	}

}
