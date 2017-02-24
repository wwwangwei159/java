package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(Integer userid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userid);
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}

	public List<User> getAll2() {
		// TODO Auto-generated method stub
		return userMapper.getAll2();
	}

	public List<User> getAll3() {
		// TODO Auto-generated method stub
		return userMapper.getAll3();
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
