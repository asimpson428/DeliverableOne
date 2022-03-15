import java.io.IOException;
import java.util.Scanner;


public class passwordapp {
	
	//private static Scanner input;

	public static void main(String args[]) throws IOException  {
		Scanner scan= new Scanner(System.in);
		System.out.println("Your password must contain:");
		System.out.println("At least one lowercase letter");
		System.out.println("At least one uppcase letter");
		System.out.println("Between 7-12 characters");
		System.out.println("An exclamation point: !");
		System.out.println("Please enter your password:");
 
//  boolean variable to store the validation of password
    boolean  passwordTrue= true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
//  entering the password
    var passwd = sc.nextLine();
    
//  check if is length is less than 8
    if (passwd.length() < 8) {
            passwordTrue= false;
            System.out.println("Minimum length should be 8 characters");
    } 
//  check if the password has at least 1 lower case character
    if(passwd.matches(".*[a-z].*")==false) {
            passwordTrue= false;
            System.out.println("Password does not have lower case characters");
    } 
//  check if the password has at least 1 upper case character
    if(passwd.matches(".*[A-Z].*")==false) {
            passwordTrue= false;
            System.out.println("Password does not have upper case characters");
	}
    
//  check if the password has exclamation character
    if(passwd.contains("!")==false) {
            passwordTrue= false;
            System.out.println("Password should have an exclamation point");
    } 
//  check if is length is greater than 12
    if (passwd.length() > 12) {
            passwordTrue= false;
            System.out.println("Maximum length is 12 characters");
    } 
    
//          Print password valid if password meets requirement.
    if(passwordTrue) {
            System.out.println("Password valid and accepted");
    }
    else {
            System.out.println("Password does not meet requirements");
    }
  
}
}
