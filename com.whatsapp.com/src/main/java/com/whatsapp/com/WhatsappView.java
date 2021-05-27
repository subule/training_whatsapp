package com.whatsapp.com;
import java.io.BufferedReader;
import java.io.InputStreamReader;


import whasappcontroller.WhatsappController;

public class WhatsappView {		
			public static void main(String[] args) throws Exception{
				String s="y";
				while(s.equals("y")) {
					BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
					WhatsappController c = new WhatsappController();
					System.out.println("***********************Main Menu*****************");
					System.out.println("Press 1 for Creating Account");
					System.out.println("Press 2 for Logging into account");
					
					System.out.println("Enter Your Choice");
					String input = bw.readLine();
					int choice = Integer.parseInt(input);
					
					switch(choice) {
					case 1: 
						c.createAccount();
						break;
					case 2:
						c.exixtingAccount();
						break;
					default:
						System.out.println("wrong input");
					}
					
					System.out.println("\nDo you want to continue press y/n");
					s=bw.readLine();
				}
	}
}
