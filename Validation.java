package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
public static void main(String[] args) {
	String s="6379940722";
	Pattern p=Pattern.compile("[6-9][0-9]{9}");
	Matcher m=p.matcher(s);
	if(m.find()) {
		System.out.println(m.group()+" no is valid");
	}else {
		System.out.println("no is not valid");
	}
}
}
