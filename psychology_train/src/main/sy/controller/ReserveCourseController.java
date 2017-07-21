package sy.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import sy.model.Course;
import sy.model.ReserveCourse;
import sy.service.ReserveCourseService;
import sy.service.UserServiceI;

import com.alibaba.fastjson.JSON;

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
        model.put("webRoot", request.getContextPath());
        return new ModelAndView("/reserveCourse/reserveCourseAdd",model);
	}
	
	
	@RequestMapping("/loadCourse")
	public ModelAndView loadCourse(HttpServletRequest request,HttpServletResponse response) {
		List<Course>  list = reserveCourseService.getCourse(new Course());
		response.setContentType("text/plain");  
        response.setHeader("Pragma", "No-cache");  
        response.setHeader("Cache-Control", "no-cache");  
        response.setDateHeader("Expires", 0);  
        response.setCharacterEncoding("utf-8");
        String str = JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm");
        PrintWriter out;
		try {
			out = response.getWriter();
			out.println(str);//
	        out.flush();  
	        out.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		} 
        return null;
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert(@ModelAttribute("form") ReserveCourse reserveCourse,HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
        model.put("webRoot", request.getContextPath());
        reserveCourse.setReserveId(Hander.getUuid());
        reserveCourseService.insert(reserveCourse);
        return "redirect:/index.jsp"; 
	}
	
}

