package gittest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method {
	private final String hello="Hello World!";
	private boolean decision=false;
	
	public Method() {
		helloworld();
	}
	
	private void helloworld() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("should i really say this?");
			System.out.println("y/n");
			String userInput = br.readLine();
			if (userInput.equalsIgnoreCase("y")) 
				decision=true;
			if (decision==true) {
				System.out.println(hello);
			} else {
				System.out.println("I will say it anyway!");
				tryagain();
			}
			
		}catch(IOException | InterruptedException e) {
			System.out.println("try again");
			helloworld();
		}		
	}
	
	private void tryagain() throws InterruptedException {
		String[] hw= {"H","e","l","l","o"," ","W","o","r","l","d"};
		for(int i=0;i<hw.length;i++) {
			System.out.println(hw[i]);
			Thread.sleep(500);
		}
		System.out.println("This Is The End");
	}
}
