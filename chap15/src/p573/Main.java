package p573;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "XXX");
		System.out.println(w);
		// aXXXc,dXXXf:gXXXi
	}

}
