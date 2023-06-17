package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//for word-\\w
//except word-\\W
//for num-\\d
//except num-\\D
//for space-\\s
//except space-\\S
//for boundry-\\b
//for group-\\G
//select all-"."
public class Group {
public static void main(String[] args) {
	String s="abcdeabAQWbacbs123456edf";
	Pattern p=Pattern.compile("[a-zA-Z0-9]");
	Matcher m=p.matcher(s);
	while(m.find()) {
		System.out.println(m.group()+" starts at -"+m.start());
	}
}
}
