package eTradeHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTradeHomework.dataAccess.abstracts.UserDao;
import eTradeHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("Hibernate Eklendi");
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(User user) {
		System.out.println(user.getId() + " id li kullanici databaseden geldi . Selamla!");
		return user;
	}

	@Override
	public ArrayList<User> getAll() {
		for (User user : users) {
			System.out.println(user.getEmail());
		}
		return users;
	}
	
}
