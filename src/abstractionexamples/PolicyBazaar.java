package abstractionexamples;

public class PolicyBazaar {

	public static void main(String args[])
	
	{
		RBI rs = new SBI();
		RBI rd = new HDFC();
		RBI rc = new ICICI();
		
		rs.rateofinterest();
		rd.rateofinterest();
		rc.rateofinterest();	
	}
}
