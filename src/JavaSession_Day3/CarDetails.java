package JavaSession_Day3;


class ConstCar {
	String CarName;
	String owner;
	double carprice;
	String carcol;
	// Initialize the class members
	ConstCar(){
		 CarName="BMW-X86";
		 owner="testuser";
		 carprice=150000.90;
		 carcol="Black";
	}
		public void DisplayCarDetails() {
		System.out.println(CarName + " " + owner + " "+ carprice + " "+ carcol);
	}
	
	}
public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConstCar obj = new  ConstCar();
		 obj.DisplayCarDetails();
		 
		 System.out.println(obj.CarName);
		 System.out.println(obj.owner);
		 System.out.println(obj.carprice);
		 System.out.println(obj.carcol);
	}

}
