package Exercise_8;

public class account {

	customer[] list;
	int count = 0;

	public account() {
		list = new customer[30];
	}

	public void addcustomer(customer c) {
       
		list[count] = new customer(c.name, c.accnum, c.balance);
		count++;

	}

	public String toString() {
		String str = "Account list\n\n";
		for (int i = 0; i < count; i++) {
			str += (list[i] + "\n");
			System.out.println();
		}
		return str;
	}

}
