package sy.service;

import java.util.List;

import sy.model.User;

public interface UserServiceI {

	public User getUserById(Integer id);

	List<User> getAll();

	List<User> getAll2();

	List<User> getAll3();

}
