package gittest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		while (true) {
			System.out.println("(1) Hello World\n(2) Datum\n(0) Beenden");
			try {
				String choice = br.readLine();
				switch (choice) {
				case "0":
					System.exit(0);
					break;
				case "1":
					new Method();
					new NewMethod();
					break;
				case "2":
					new Date();
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
