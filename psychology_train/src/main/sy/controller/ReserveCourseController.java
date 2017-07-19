package sy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import sy.model.User;
import sy.service.ReserveCourseService;

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
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
        return new ModelAndView("user/userIndex");
	}
	
}

