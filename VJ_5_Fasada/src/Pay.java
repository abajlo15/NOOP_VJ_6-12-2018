
public class Pay implements Payment {

	public String paymentAccountName;
	public String paymetnPassword;

	public String bankAccountNumber = "123456782";

	@Override
	public void assing2PaymentAccount(String usName, String password) {
		this.paymentAccountName = usName;
		this.paymetnPassword = password;

		System.out.println("Payment username assigned to this Payment Account: " + paymentAccountName);
		System.out.println("Payment Password assigned to this Payment Account: " + paymetnPassword);

	}

	@Override
	public boolean checkCustomerData() {

		if (paymentAccountName != null & paymetnPassword != null) {
			System.out.println("Payment name and password assigned");
			return true;
		} else {
			System.out.println("Payment name and password not assigned");
			return false;
		}

	}

	@Override
	public void Link2CustomerBankAccount() {

		System.out.println("Bank account linked to this account");
	}

	@Override
	public boolean performTransaction2BankAccount() {
		if (checkCustomerData() == true) {
			return true;
		} else {
			return false;
		}

	}

}
