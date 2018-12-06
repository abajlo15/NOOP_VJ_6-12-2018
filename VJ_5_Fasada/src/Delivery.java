
public class Delivery implements Shipping {

	@Override
	public void roadTransportation() {

		System.out.println("Road Transportation engaged...");

	}

	@Override
	public void seaTransportation() {
		
		System.out.println("Sea transportation engaged...");

	}

	@Override
	public void airTransportation() {
		System.out.println("Air transportation engaged...");
	}

	@Override
	public void deliveryNotification() {
		
		System.out.println("Delivered to your adress.");
		
	}

}
