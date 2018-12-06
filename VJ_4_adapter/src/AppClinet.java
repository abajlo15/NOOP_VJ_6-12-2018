
public class AppClinet {

	public static void main(String[] args) {
		NovelWriter wrNew = new NovelWriter();
		wrNew.writeNovel(1);
		Writer oldSchool = new AdapterNovel(new SFNovelWriter());
		oldSchool.writeNovel(3);
	}
}
