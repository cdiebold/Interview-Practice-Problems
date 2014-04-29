import java.util.*;
//import java.collections*;
class Main{
	public static void main(String[] args) {
		String x = "CHRISTOPHER"; // original string
		String reversed = new StringBuilder(x).reverse().toString(); // 1st solution
		System.out.println(reversed);
		
		System.out.println(reverse(x)); 
				//System.out.println(rev.toString());
	}
	public static void swap(char a, char b)
	{
		char temp = a;
		a = b;
		b = temp;
	}
	public static String reverse(String s) { // 2nd solution
	    if (s.length() <= 1) {
	        return s;
	    }
	    return reverse(s.substring(1)) + s.charAt(0);
	}
	String reverse(String str) {			//3rd solution
	    char[] c = str.getCharArray
	    char[] r = new char[c.length];
	    int    end = c.length - 1

	    for (int n = 0; n <= end; n++) {
	        r[n] = c[end - n];
	    }

	    return new String(r);
	}
}