package JavaSession_Day3;

public class MainGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 GetSetDemo p = new GetSetDemo();
		 
		 
		 p.setstr1("test automation");
		 
		 String res1 = p.getstr1();
		 System.out.println(res1);
		 
		 
		 p.setSal1(29000.90);
		 
		 double res2=p.getSal1();
		 System.out.println(res2);
		 
		 
		 p.setcode(1010);
		 System.out.println(p.getCode());
		/*  p.setstr1("testdat1");
		  System.out.println(p.getstr1());
		  
		  
		  p.setSal1(28000.90);
		  System.out.println(p.getSal1());*/
	

	}

}
