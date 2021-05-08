package eTradeHomework.business.concretes;

import eTradeHomework.business.abstracts.AuthService;
import eTradeHomework.entities.concretes.User;

public class GoogleAuthManager implements AuthService{

	@Override
	public boolean login(User user) {
		System.out.println(user.getEmail()+ " emailiniz ile basarili giris yapildi");
		return true;
	}

	@Override
	public boolean register(User user) {
		System.out.println(user.getEmail() + " emailiniz ile basarili bir sekilde kayit oldunuz");
		return true;
	}

	

}
