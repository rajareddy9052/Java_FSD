package string;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("hello world");
		System.out.println(str.charAt(4));
		System.out.println(str.reverse());
		System.out.println(str.replace(0, 5, "welcome"));
		System.out.println(str.reverse());
	}

}
