package JavaSession_Day3;

public class GetSetDemo {
	  // Private class members
	  private String str1; 
	  private double sal1;
	  private int code;


	  public String getstr1() {
	    return str1;
	  }


	  public void setstr1(String str) {
	    this.str1 = str;
	  }
	  
	  
	  public void setSal1(double sal) {
		  this.sal1=sal;
	  }
	  
	  public double getSal1() {
		  return sal1;
	  }
	  
	  
	  public int getCode() {
		  return code;
	  }
	  
	  public void setcode(int num) {
		  this.code=num;
	  }
	  
	  
	  public static void main(String args[]) {
		  
		/*  GetSetDemo obj = new GetSetDemo();
		  
		  obj.sal1=90.98;
		  System.out.println(obj.sal1);*/
		 
	  }
	}