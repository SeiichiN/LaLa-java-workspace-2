package p572;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi.jkl;mno";
		String[] words = s.split("[,:.;h]");
		for (String w : words) {
			System.out.print(w + "->");;
		}
		// abc->def->g->i->jkl->mno->
	}

}
