package Assignment;

public class Operators {
	
		// TODO Auto-generated method stub
 int inputa, inputb, inputa1,inputb1, sum, diff, mul, div, mod;
 
 public  void calculatesum(int inputa, int inputb) {
	 sum = inputa+inputb; 
	 System.out.println("The Value of Sum is " +sum);
 }
	 
	 public  void calculatediff(int inputa1, int inputb1) {	 
		 diff = inputa1 - inputb1;
		 System.out.println("The Value of Difference is " +diff);
	}
	 
	 public  void calculatemul(int inputa, int inputb) {	 
		mul = inputa* inputb;
		 System.out.println("The Value of Multiplication is " +mul);
	 }
	
	 public  void calculatediv(int inputa1, int inputb1) {	 
			div = inputa1/ inputb1;
			 System.out.println("The Value of Division is " +div);
		 }
		
	 public  void calculatemod(int inputa1, int inputb1) {	 
			mod = inputa1% inputb1;
			 System.out.println("The Value of Mod is " +mod);
		 }
	}


