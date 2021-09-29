class InvalidChoiceException extends Exception
{
    public InvalidChoiceException(String str)
    {
        super(str);
    }
}
public class XYZBank {
	String name;
	String city,state;
	long pin;
	float balanceAmount;
	String createdDate;
	String status;
	String accountType;
	public XYZBank(String name, String city, String state, long pin, float balanceAmount, String createdDate,
			String status) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.balanceAmount = balanceAmount;
		this.createdDate = createdDate;
		this.status = status;
	}
	
	public void ShowDetail() {
		System.out.println("Owner Name "+this.name);
		System.out.println("Address "+this.city +" "+this.state +" "+ this.pin);
		System.out.println("Balance Amount " + this.balanceAmount);
		System.out.println("Created_date " + this.createdDate);
        System.out.println("status " + this.status);
        System.out.println("Account Type " + this.accountType);
        
	}
	
	public void deposite(float amount) {
		if(this.status == "active")
		this.balanceAmount += amount;
		
		else System.out.println("the account is " +this.status);
	}
	
	public void withdraw(float amount) throws InvalidChoiceException {
	    if(this.status != "active") {
	    	System.out.println("the account is " +this.status);
	    }
		if(amount > this.balanceAmount) {
            throw new InvalidChoiceException("INSUFFIENT BALANCE");
		}
		else {
			this.balanceAmount -= amount;
		}
	}
}
