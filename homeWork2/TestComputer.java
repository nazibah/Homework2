package homeWork2;

public class TestComputer {
	
	
	public static void main(String[] args) {

		computer comp1 = new computer("Apple MacAir",8, 10, true, 750);

		comp1.nameAndModel= "nazibae";


		comp1.myComputer();

		computer.ourComputer();
		
		
		
		computer comp2 = new computer("black", 12, 500, false,8);


		comp2.myComputer();

		comp1.myComputer();

		computer.ourComputer();


		computer comp3 = new computer ("blue", 15);

		computer.ourComputer();

}
}