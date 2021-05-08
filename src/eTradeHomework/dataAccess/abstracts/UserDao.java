package eTradeHomework.dataAccess.abstracts;

import java.util.ArrayList;

import eTradeHomework.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(User user);
	ArrayList<User> getAll();
}
