package p688;

public class Main {

	public static void main(String[] args) {
		String filename = "sample.wav";
		try {
			if (filename.endsWith(".wav")) {
				throw new UnsupportedMusicFileException
					("未対応のファイルです");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
