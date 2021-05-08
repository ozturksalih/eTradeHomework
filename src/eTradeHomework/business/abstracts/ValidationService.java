package eTradeHomework.business.abstracts;

import eTradeHomework.entities.concretes.User;

public interface ValidationService {
	boolean isValid(User user);
	boolean isEmailValid(String email);
	boolean isPasswordValid(String password);
	boolean isNameAndSurnameValid(User user);
}
