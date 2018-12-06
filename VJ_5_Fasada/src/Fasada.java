
public class Fasada {

	private Account acc = new Account();
	private Pay pay = new Pay();
	private Delivery delivery = new Delivery();
	private Warehouse1 skladiste = new Warehouse1();

	public void logIn(String usName, String password) {

		acc.assign2Account(usName, password);
		acc.checkCustomerData();

	}

	public void payment() {

		pay.assing2PaymentAccount(acc.AccountName, acc.Password);
		pay.Link2CustomerBankAccount();
		pay.checkCustomerData();
		pay.performTransaction2BankAccount();

	}

	public void delivery() {

		delivery.airTransportation();
		

	}

	public void confirmation() {

		skladiste.invoiceProcessing();
		skladiste.findCustomerItems();
		skladiste.packingItems();
		skladiste.dispatchments();
		delivery.deliveryNotification();

	}

}
