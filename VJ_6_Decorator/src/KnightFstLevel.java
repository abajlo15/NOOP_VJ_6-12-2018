
public class KnightFstLevel implements Knight {
	
	int positionx = 0;
	int positiony = 0;
	private int strength;
	
	public Knight knight;
	
	
	public KnightFstLevel(Knight knight) {
		
		this.knight = knight;
	}
	
	@Override
	public void attack() {
		
		System.out.println("Udara ostrim macem.");
		
	}

	@Override
	public void movement(int moveX, int moveY) {

		positionx += moveX;
		positiony += moveY;

		System.out.println("Vitez se pomice za " + moveX + " unaprijed.");
		System.out.println("Vitez se pomice za " + moveY + " U desno.");

	}

	@Override
	public void strength(int str) {
		
		this.strength += str;
		System.out.println("Vizet je ojaca za: "+str);

	}

	@Override
	public void goAway() {
		System.out.println("Vitez bjezi...");
	}


}
