package Test;

import java.util.Date;

public class Test {
	
	@org.junit.Test
	public void test() {
		Date date = new Date();
		String string = date.toString();
		System.out.println(string);
	}
}
