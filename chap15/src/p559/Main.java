package p559;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java と JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で、最初にJavaが登場する位置は" +
				s1.indexOf("Java"));
		System.out.println("文字列s1で、最後にJavaが登場する位置は" +
				s1.lastIndexOf("Java"));
		
		System.out.println("文字列s1で、最初にvが登場する位置は" +
				s1.indexOf('v'));
		System.out.println("文字列s1で、最後にvが登場する位置は" +
				s1.lastIndexOf('v'));


	}

}
