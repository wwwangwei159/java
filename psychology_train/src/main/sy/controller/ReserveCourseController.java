package sy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import sy.model.MessageLeave;
import sy.model.ReserveCourse;
import sy.model.User;
import sy.service.ReserveCourseService;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/reserve")
public class ReserveCourseController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	private ReserveCourseService reserveCourseService;

	public ReserveCourseService getReserveCourseService() {
		return reserveCourseService;
	}

	@Autowired
	public void setReserveCourseService(ReserveCourseService reserveCourseService) {
		this.reserveCourseService = reserveCourseService;
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
		Map<String,Object> model = new HashMap<String,Object>();  
		List<User>  users = userService.getByType("");
		model.put("webRoot", request.getContextPath());
        model.put("users",users);  
        return new ModelAndView("reserveCourse/reserveCourseAdd",model);
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("form") ReserveCourse reserveCourse,HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
        model.put("webRoot", request.getContextPath());
        reserveCourse.setReserveId(Hander.getUuid());
        reserveCourseService.insert(reserveCourse);
        return new ModelAndView("reserveCourse/rsuccess",model);
	}
	
}

