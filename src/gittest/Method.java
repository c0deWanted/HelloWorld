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
				System.out.println("Where is my cherry-pick? :(");
			}
			
		}catch(IOException e) {
			System.out.println("try again");
			helloworld();
		}		
	}
}
