package sy.service;

import java.util.List;

import sy.model.User;

public interface UserServiceI {

	public User getUserById(String id);
	
	 int insert(User record);

	List<User> getAll();

	List<User> getAll2();

	List<User> getAll3();
	
	List<User> getByType(String type);

}
