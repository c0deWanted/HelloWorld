package gittest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method {
	
	public static void helloworld() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("should i really say this?");
			System.out.println("y/n");
			String decis = br.readLine();
			if (decis.contentEquals("y")) {
				System.out.println("Hello World!");
			} else {
				System.out.println("I will say it anyway!");
				System.out.println("* Hello World! *");
			}
			
		}catch(IOException e) {
			System.out.println("try again");
			helloworld();
		}		
	}
	
	public static void tryagain() throws InterruptedException {
		String[] hw= {"H","e","l","l","o"," ","W","o","r","l","d"};
		for(int i=0;i<hw.length;i++) {
			System.out.println(hw[i]);
			Thread.sleep(500);
		}
		System.out.println("This Is The End");
	}
}
