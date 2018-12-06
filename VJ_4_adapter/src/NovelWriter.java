
public class NovelWriter implements Writer {

	@Override
	public void writeNovel(int type) {

		switch (type) {
		case 1:
			System.out.println("Historic novel....");
			break;
		case 2:
			System.out.println("Romantic novel...");
			break;
		case 3:
			System.out.println("Triller novel...");
			break;
		default:
			System.out.println("Unknown novel type...");
			break;
		}

	}

}
