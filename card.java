package Exercise_8;

public class card {
	int number;
	String type;

	public card(String face, int value) {

		number = value;
		type = face;

	}

	public String toString() {
		String str;
		str = type + "\t" + number;
		return str;
	}

}
