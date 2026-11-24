package finance.infosys.CA_bean_ioc_container;

public class AccountServices {
	
	String cashTransfer;
	String cod;
	String upi;
	String ptp;
	public AccountServices(String cashTransfer, String cod, String upi, String ptp) {
		super();
		this.cashTransfer = cashTransfer;
		this.cod = cod;
		this.upi = upi;
		this.ptp = ptp;
	}
	//@Override
	public void accountServicesDetails() {
		String data =  "AccountServices [cashTransfer=" + cashTransfer + ", cod=" + cod + ", upi=" + upi + ", ptp=" + ptp + "]";
		System.out.println(data);
	}
	

}
