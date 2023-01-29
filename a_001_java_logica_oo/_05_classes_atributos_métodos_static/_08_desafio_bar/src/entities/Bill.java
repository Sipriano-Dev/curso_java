package entities;

public class Bill {

	public String gender;
	public int beer;
	public int barbecue;
	public int softdrink;

	public double cover() {
		if (feeding() > 30.00) {
			return 0;
		} else {
			return 4.00;
		}
	}

	public double feeding() {
		return beer * 5.00 + softdrink * 3.00 + barbecue * 7.00;
	}

	public double ticket() {
		if (gender.equals("F")) {
			return 8.00;
		} else {
			return 10.00;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	

}
