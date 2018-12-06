
public class Warehouse1 implements Warehouse {

	@Override
	public void invoiceProcessing() {

		System.out.println("Sending Invoice....");

	}

	@Override
	public void findCustomerItems() {

		System.out.println("Found customer items...");

	}

	@Override
	public void packingItems() {

		System.out.println("Customer items packed...");

	}

	@Override
	public void dispatchments() {
		
		System.out.println("Items dispatched....");

	}

}
