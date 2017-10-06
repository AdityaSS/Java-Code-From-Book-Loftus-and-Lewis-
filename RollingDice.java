package Exercise_5;

public class RollingDice {

	public static void main(String[] args) {
		
		Die die1 = new Die();
		Die die2 = new Die();
		
		die1.SetFaceValue(5);
		die2.SetFaceValue(6);
		
		System.out.println("Die 1 Value is : " + die1);
		System.out.println("Die 2 Value is : " + die2);
	}

}
