package sy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import sy.model.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
		String id = request.getParameter("id");
		Map<String,Object> model = new HashMap<String,Object>();  
		User u = userService.getUserById(id);
        model.put("userName",id);  
        model.put("user",u);  
        model.put("webRoot", request.getContextPath());
        
        return new ModelAndView("user/userIndex",model);
	}
	
	
	@RequestMapping(value="/{id}/userShow",produces = "application/json;charset=UTF-8")
	public ModelAndView showUserByJason(@PathVariable String id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		return new ModelAndView("user/userShow").addObject("webRoot", request.getContextPath());
	}
	
	@RequestMapping("/{id}/getUser")
	public ModelAndView getUser(@PathVariable String id, HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
		User u = userService.getUserById(id); 
        model.put("user",u);  
        
        return new ModelAndView("user/userDetail",model);
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute("form") User user, HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
		user = userService.login(user);
		if(user!=null){
			model.put("webRoot",request.getContextPath());  
	        model.put("user",user);
	        return new ModelAndView("index",model);
		}else{
			return null;
		}
       
        
       
	}
	
	@RequestMapping("/tologin")
	public ModelAndView tologin(HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>(); 
        model.put("webRoot",request.getContextPath()); 
        
        return new ModelAndView("user/userLogin",model);
	}

	
	
}
