
public class Client {

	
	public static void main(String[] args) {
		
		Fasada fasada = new Fasada();
		
		fasada.logIn("abajlo15","Venci123");
		fasada.payment();
		fasada.delivery();
		fasada.confirmation();

	}

}
