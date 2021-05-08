package eTradeHomework.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTradeHomework.business.abstracts.AuthService;
import eTradeHomework.business.abstracts.ValidationService;
import eTradeHomework.entities.concretes.User;

public class EmailAuthManager implements AuthService{
	
	private ValidationService validationService;
	

	public EmailAuthManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	@Override
	public boolean login(User user) {
		return true;
	}

	@Override
	public boolean register(User user) {
		boolean isValid = validationService.isValid(user);
		return isValid;
	}

	

	

}
