package sy.service;

import java.util.List;

import sy.model.User;

public interface UserServiceI {

	public User getUserById(String id);
	
	public User getUserById(Integer userid);

	List<User> getAll();

	List<User> getAll2();

	List<User> getAll3();

}
