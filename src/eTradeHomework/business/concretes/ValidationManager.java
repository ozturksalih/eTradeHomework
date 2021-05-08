package eTradeHomework.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTradeHomework.business.abstracts.ValidationService;
import eTradeHomework.entities.concretes.User;

public class ValidationManager implements ValidationService{

	final String regexEmail = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	
	@Override
	public boolean isValid(User user) {
		boolean isValidAll = isEmailValid(user.getEmail()) && isPasswordValid(user.getPassword()) 
				&&  isNameAndSurnameValid(user);
		return isValidAll;
	}
	
	@Override
	public boolean isEmailValid(String email) {
		Pattern pattern = Pattern.compile(regexEmail,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if(matchFound && email!=null) {
		      return true;
		    } else {
		    	System.out.println("Emailiniz gecersiz lutfen emailinizi duzeltip tekrar deneyiniz");
		      return false;
		    }
	}


	@Override
	public boolean isPasswordValid(String password) {
		if(password.length()<6 ) {
			System.out.println("password can have minimum 6 characters");
			return false;
		}
		return true;
	}

	@Override
	public boolean isNameAndSurnameValid(User user) {
		if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("Name and LastName can have minimum 2 characters!");
			return false;
		}
		return true;
	}

}
