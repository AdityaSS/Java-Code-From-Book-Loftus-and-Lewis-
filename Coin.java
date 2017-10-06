package Exercise_7;

public class Coin implements Lockable {
	int key;
	private final int Heads = 0;
	private final int Tails = 1;
	private int face;

	public void setkey(int n) {
		key = n;

	}

	public void lock(int n) {
		System.out.println("Object is locked");
	}

	public void unlock(int n) {
		flip();

	}

	private void flip() {
		face = (int) (Math.random() * 2);
		toString();

	}

	public boolean locked(int n) {
		if (n == key) {
			System.out.println("True");
			unlock(n);
			return true;
		} else {
			System.out.println("False");
			lock(n);
			return false;
		}
	}

	 public String toString() {
		String facename = " ";
		if (face == Heads) {
			facename = "Heads";
			System.out.println("Coin face is : " + facename);
		} else if(face == Tails) {
			facename = "Tails";
			System.out.println("Coin face is : " + facename);
		}
		return facename;
		
	}

}
