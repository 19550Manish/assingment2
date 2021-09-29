
public class MainApp {

	public static void main(String[] args) {
		Current current = new Current("ram","delhi","new delhi",110086,50000.0f,"16-mar-19","active"); 
       		current.ShowDetail();
       		current.withdraw(600f);
       
       		current.deposite(5000f);
       		current.ShowDetail();

	}

}
