
public class Account implements CustomerAccount {
	
	public String AccountName;
	public String Password;

	@Override
	public void assign2Account(String usName, String password) {
		
		this.AccountName = usName;
		this.Password = password;
		
		System.out.println("Assigned Username and pasword to this account.\nUsername: "+usName+"\nPassword: "+password);
	}

	@Override
	public boolean checkCustomerData() {
		
		if (AccountName != null & Password != null) {
			System.out.println("To this account Username and Password are assigned.");
			return true;
		}else {
			System.out.println("There are no Username and Password assigned to this Account.");
			return false;
		}
		
	}

}
