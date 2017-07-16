

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.MessageLeave;
import sy.model.User;
import sy.service.MessageLeaveService;
import sy.service.UserServiceI;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test1() {
		User u = userService.getUserById("1");
		logger.info("result............"+JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void insertTest1() {
		User user = new User();
		user.setUserId("5");
		user.setName("test name2");
		int i = userService.insert(user);
		logger.info("result............"+i);
	}

	@Test
	public void test2() {
		List<User> l = userService.getAll();
		logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void test3() {
		List<User> l = userService.getAll2();
		logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void test4() {
		List<User> l = userService.getAll3();
		logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	private MessageLeaveService messageService;

	public MessageLeaveService getMessageService() {
		return messageService;
	}

	@Autowired
	public void setMessageService(MessageLeaveService messageService) {
		this.messageService = messageService;
	}	
	
	
	@Test
	public void test6() {
		MessageLeave mess = messageService.getMessageId("3");
		logger.info("result............"+JSON.toJSONStringWithDateFormat(mess, "yyyy-MM-dd HH:mm:ss"));
		
		User u = userService.getUserById("5");
		logger.info("result............"+JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void insertTest2() {
		MessageLeave message = new MessageLeave();
		message.setMessId("3");
		message.setMobile("11111111233");
		int i = messageService.insert(message);
		logger.info("result............"+i);
		
		User user = new User();
		user.setUserId("5");
		user.setName("test name2");
		int j = userService.insert(user);
		logger.info("result............"+j);
		
		
	}
	
	
	
}
