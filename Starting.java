package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//for to find  Starting character =^
// for to find last word=$
// for to find particular character=|
// group element-[]
public class Starting {
public static void main(String[] args) {
	String s="i glad to meet you";
	Pattern p=Pattern.compile("[eay]");
	Matcher m=p.matcher(s);
	while(m.find()) {
		System.out.println(m.group() +" starts at-"+m.start());
	}
}
}
