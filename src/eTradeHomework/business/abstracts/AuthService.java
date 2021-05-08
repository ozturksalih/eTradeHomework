package eTradeHomework.business.abstracts;

import eTradeHomework.entities.concretes.User;

public interface AuthService {
	boolean login(User user );
	boolean register(User user);
	
}
