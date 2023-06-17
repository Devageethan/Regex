package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basis {
	public static void main(String[] args) {
String s="hello every one how are you";
Pattern p=Pattern.compile("you$");
Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+" "+"starts at-"+m.start()+"-ends at-"+m.end());
		}
	//	System.out.println("not matched");
	}
}
