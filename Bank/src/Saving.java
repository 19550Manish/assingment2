
public class Saving extends XYZBank {

	public Saving(String name, String city, String state, long pin, float balanceAmount, String createdDate,
			String status) {
		super(name, city, state, pin, balanceAmount, createdDate, status);
		this.accountType = "Saving Account";
	}

}
