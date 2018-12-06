
public class App {

	public static void main(String[] args) {

		Knight knight = new SimpleKnight();

		knight.attack();
		knight.attack();
		knight.strength(10);
		knight.movement(10, 2);

		System.out.println("Vitez je level-upa");
		
		knight = new KnightFstLevel(knight);
		
		knight.attack();
		knight.attack();
		knight.strength(5);
		knight.movement(5, 2);
		knight.attack();

	}

}
