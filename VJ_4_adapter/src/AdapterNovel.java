
public class AdapterNovel implements Writer {

	SFNovelWriter writer;

	public AdapterNovel(SFNovelWriter wr) {

		this.writer = wr;
	}

	public void writeNovel(int type) {
		writer.writeSFNovel();
	}

}
