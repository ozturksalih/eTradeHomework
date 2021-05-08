package eTradeHomework.business.concretes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import eTradeHomework.business.abstracts.AuthService;
import eTradeHomework.business.abstracts.UserService;
import eTradeHomework.dataAccess.abstracts.UserDao;
import eTradeHomework.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;
	
	

	public UserManager(UserDao userDao, AuthService authService) {
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void signUp(User user) {
		boolean isAddable = this.authService.register(user);
		boolean isUserExists = isUserExist(user);
		if(isAddable && isUserExists) {
			userDao.add(user);
		}
	}
	
	
	
	@Override
	public void signIn(User user) {
		//database ile karsilastirma yapilacak eskiden kayit olup olmadigi
		userDao.get(user);
	}

	@Override
	public User getUser(User user) {
		return this.userDao.get(user);
	}

	@Override
	public ArrayList<User> getAll() {
		
		return this.userDao.getAll();
	}

	public boolean isUserExist(User user) {
		ArrayList<User> users = getAll();
		
		for (User i : users) {
			if(i.getEmail().equals(user.getEmail()) ) {
				System.out.println("This email already registered our services");
				return false;
			}
		}
		return true;
	}
	
	



}
