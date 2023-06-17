package regex;

import java.util.StringTokenizer;

public class Token {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("devageethan");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
}
}
