package JavaSession_Day3;

class CarDetails1{
	String CarName;
	String Owner;
	double carprice;
	
	CarDetails1(){
		CarName="Tata Nex";
		Owner="testuser2";
		carprice=1000000.90;
		
	}
	CarDetails1(String cnm,String own , double cp){
		
		this.CarName=cnm;
		this.Owner=own;
		this.carprice=cp;
	}
	
	CarDetails1(String cnm1,double p){
		this.CarName=cnm1;
		this.carprice=p;
		
	}
	
}

public class ConstParamCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDetails1 obj2= new CarDetails1();
		System.out.println(obj2.CarName+ " "+ obj2.Owner+ " "+obj2.carprice);
		
		
		CarDetails1 obj1 = new CarDetails1("BMW","testuser",1800000.90);
		
		System.out.println(obj1.CarName + " "+ obj1.Owner+ " "+ obj1.carprice);
		CarDetails1 obj3 = new CarDetails1("ABC",1500000.900);
		
		System.out.println(obj1.CarName + obj3.carprice);
		

	}

}
