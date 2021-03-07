package Strings;

import java.nio.charset.Charset;

public class Problem1 {

	public static void main(String[] args) {
		
		String s = "Raghunath Majhi";
		/*System.out.println(s);
		
		String name = new String("Hello World");
		System.out.println(name);
		
		byte[] arr_byte = {'R','A','G','H','U'};
		String byteString = new String(arr_byte);
		System.out.println(byteString);
		
		Charset cs =  Charset.defaultCharset();
		String newStr = new String(arr_byte,cs);
		
		System.out.println(cs);
		System.out.println(newStr);
		
		String newStr2 = new String(arr_byte,1,3);
		System.out.println(newStr2);
		
		String newStr3 = new String(arr_byte,1,3,cs);
		System.out.println(newStr3);
		
		int[] unicode = {1,2,3,4,5};
		//String newStr4 = new String(unicode,1,4,cs);
		
		System.out.println(newStr4);*/
		
		
		System.out.println("charAt Function "+s.charAt(1));
		System.out.println("codePointAt Function "+s.codePointAt(4));
		System.out.println(s.compareTo("Hello World"));
		System.out.println(s.concat("Behera"));
		System.out.println(s.contains("a"));
		System.out.println(s.contentEquals("Raghunath Majh"));
		char[] arr= s.toCharArray();
		System.out.println(arr[5]);
		System.out.println(s.toCharArray());
		System.out.println(s.subSequence(1,8));

	}

}
