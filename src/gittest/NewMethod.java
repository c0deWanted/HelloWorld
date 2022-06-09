package gittest;

public class NewMethod {
	private final String hello="Hello again!";
	
	public NewMethod() {
		System.out.println(hello());
	}
	
	private String hello() {
		return hello;
	}

}
