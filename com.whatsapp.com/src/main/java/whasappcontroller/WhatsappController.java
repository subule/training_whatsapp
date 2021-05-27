package whasappcontroller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhatsappController {

	// SIMILAR FOR ALL OTHERS
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		public void createAccount() throws Exception {
			System.out.println("Enter Your Number: ");
			String snumber = bc.readLine();
			int number = Integer.parseInt(snumber);
			System.out.println("Enter Your Password: ");
			String passWord = bc.readLine();
			System.out.println("Confirm Your Password: ");
			String passConfirm = bc.readLine();
			if(snumber.length() == 10) {
				System.out.print("Account Created Successfully with the Phone No. : "+number+".");
			}else {
				System.out.println("Invalid Phone Number");
			}
		}

		public void exixtingAccount() throws Exception {
			System.out.println("Enter Your Number ");
			String no = bc.readLine();
			System.out.println("Enter Your Email-ID: ");
			String eMail = bc.readLine();
			System.out.println("Enter Your Password: ");
			String passWord = bc.readLine();
			System.out.println("Logged In Successfully");
			
		}

	}