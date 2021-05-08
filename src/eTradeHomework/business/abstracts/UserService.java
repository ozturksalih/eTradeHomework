package eTradeHomework.business.abstracts;

import java.util.ArrayList;

import eTradeHomework.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	User getUser(User user);
	ArrayList<User> getAll();
	
}
