package eTradeHomework;

import java.util.Scanner;

import eTradeHomework.business.concretes.EmailAuthManager;
import eTradeHomework.business.concretes.GoogleAuthManager;
import eTradeHomework.business.concretes.UserManager;
import eTradeHomework.business.concretes.ValidationManager;
import eTradeHomework.dataAccess.concretes.HibernateUserDao;
import eTradeHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User salih = new User(1,"Salih","ozturk","salih@gmail.com","1235678");
		UserManager manager = new UserManager(new HibernateUserDao() , new EmailAuthManager(new ValidationManager()));
		manager.signUp(salih);
		
		Scanner scanner = new Scanner(System.in);
		String summary = "1.Register\n2.Log In";
		
		while(true) {
			System.out.println(summary);
			int option = scanner.nextInt();
			
			if(option == 1) {
				System.out.println("Name : ");
				scanner.nextLine();
				String name = scanner.nextLine();
				
				
				System.out.println("Surname : ");
				String surname =scanner.nextLine();
				
				System.out.println("Email : ");
				String email  = scanner.nextLine();
				
				System.out.println("Password : ");
				String password = scanner.nextLine();
				
				
				User user = new User (4 , name , surname , email , password);
				System.out.println(user.getFirstName() + " " + user.getEmail()+" ile sisteme ekleniyor ...");
				manager.signUp(user);
				
			}else if(option == 2) {
				
			}else {
				break;
			}
		}
	}

}
